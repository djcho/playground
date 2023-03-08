import com.playground.authentication.Iat.api.IatAuthApi;
import com.playground.authentication.Iat.authenticator.app.IatAppAuthData;
import com.playground.authentication.Iat.authenticator.app.IatAppAuthDescriptor;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthData;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthDescriptor;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthData;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthDescriptor;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthData;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthDescriptor;
import com.playground.authentication.Iat.model.*;
import com.playground.authentication.IatAuthServiceImpl;
import com.playground.authentication.IatAuthenticatorFactory;
import com.playground.authentication.external.ExternalAuthService;

public class Main {

    public static void main(String[] args) {
        ExternalAuthService externalAuthService = new IatAuthServiceImpl(new IatAuthApi(), new IatAuthenticatorFactory());

        //인증 수단 목록 가져오기
        IatAuthPolicy authPolicy = externalAuthService.getAuthPolicy("djcho", IatAuthPolicy.class);

        //기기 등록
        IatReqDeviceRegResult iatReqDeviceRegResult = externalAuthService.requestDeviceRegistration("djcho", IatReqDeviceRegResult.class);
        String qrData = iatReqDeviceRegResult.getRequestQr();

        //기기 등록 확인
        IatDeviceRegResult iatDeviceRegResult = externalAuthService.getDeviceRegistrationResult("djcho", "requestId", IatDeviceRegResult.class);

        //앱 인증 요청
        IatAppReqAuthResult iatAppReqAuthResult = externalAuthService.requestAuthentication(
                new IatAppAuthDescriptor(IatAppAuthData.builder()
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()),
                IatAppReqAuthResult.class);

        //otp 인증 (directly authentication)
        IatOtpAuthResult iatOtpAuthResult = externalAuthService.authenticate(
                new IatOtpAuthDescriptor(IatOtpAuthData.builder()
                        .otpNumber("123123")
                        .requestId(iatAppReqAuthResult.getRequestId())
                        .build()),
                IatOtpAuthResult.class);

        //email 인증 요청 (requestable authentication)
        IatEmailReqAuthResult iatEmailReqAuthResult = externalAuthService.requestAuthentication(
                new IatEmailAuthDescriptor(IatEmailAuthData.builder()
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()),
                IatEmailReqAuthResult.class);

        IatEmailGetAuthResult iatEmailGetAuthResult = externalAuthService.getAuthenticationResult(
                new IatEmailAuthDescriptor(IatEmailAuthData.builder()
                        .authCode("546456")
                        .requestId(iatEmailReqAuthResult.getRequestId())
                        .build()),
                IatEmailGetAuthResult.class);

        //app 인증 확인
        IatAppGetAuthResult iatAppGetAuthResult = externalAuthService.getAuthenticationResult(
                new IatAppAuthDescriptor(IatAppAuthData.builder()
                        .requestId("requestId")
                        .build()),
                IatAppGetAuthResult.class);

        //수동 otp 등록 여부 확인
        IatManualOtpCheckedAuthRegResult iatManualOtpCheckedAuthRegResult = externalAuthService.checkAuthRegistration(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .userId("djcho")
                        .build()),
                IatManualOtpCheckedAuthRegResult.class);

        String iatJwt = externalAuthService.genUserAuthorizationToken("djcho");
        //수동 otp 등록 요청
        IatManualOtpReqAuthRegResult iatManualOtpReqAuthRegResult = externalAuthService.requestAuthRegistration(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()),
                IatManualOtpReqAuthRegResult.class);

        //수동 otp 등록
        IatManualOtpRegAuthResult registerAuthResponse = externalAuthService.registerAuthentication(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .requestId(iatManualOtpReqAuthRegResult.getRequestId())
                        .otpNumber("123123")
                        .build()),
                IatManualOtpRegAuthResult.class);
    }
}