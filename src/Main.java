import ExternalAuth.*;
import Iat.*;

public class Main {

    public static void main(String[] args) {
        ExternalAuthService externalAuthService = new ExternalAuthServiceImpl(new IatAuthApi(), new IatAuthenticatorFactory());
        AuthPolicy authPolicy = externalAuthService.getAuthPolicy("djcho");

        //기기 등록
        DeviceRegistrationResponse deviceRegistrationResponse = externalAuthService.requestDeviceRegistrationQr("djcho");
        String qrData = deviceRegistrationResponse.getQrData();

        //기기 등록 확인
        DeviceRegistrationResultResponse deviceRegistrationResultResponse = externalAuthService.requestDeviceRegistrationResult("requestId");

        //otp 인증 (directly authentication)
        AuthenticationResponse authenticationResponse = externalAuthService.authenticate(
                new IatOtpAuthDescription(IatOtpAuthData.builder()
                        .otpNumber("123123")
                        .requestId("requestId")
                        .build()));

        //email 인증
        authenticationResponse = externalAuthService.authenticate(
                new IatEmailAuthDescription(IatEmailAuthData.builder()
                        .authCode("546456")
                        .requestId("requestId")
                        .build()));

        //app 인증 (request authentication)
        RequestAuthResponse requestAuthResponse = externalAuthService.requestAuthentication(
                new IatAppAuthDescription(IatAppAuthData.builder()
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()));

        RequestAuthResultResponse requestAuthResultResponse = externalAuthService.requestAuthenticationResult(
                new IatAppAuthDescription(IatAppAuthData.builder()
                        .requestId("requestId")
                        .build()));
    }
}