import ExternalAuth.*;
import Iat.*;

public class Main {

    public static void main(String[] args) {
        ExternalAuthService externalAuthService = new ExternalAuthServiceImpl(new IatAuthApi(), new IatAuthenticatorFactory());

        //인증 수단 목록 가져오기
        GetAuthPolicyResponse authPolicy = externalAuthService.getAuthPolicy("djcho");

        //기기 등록
        RequestDeviceRegistrationResponse deviceRegistrationResponse = externalAuthService.requestDeviceRegistration("djcho");
        String qrData = deviceRegistrationResponse.getQrData();

        //기기 등록 확인
        GetDeviceRegistrationResultResponse deviceRegistrationResultResponse = externalAuthService.getDeviceRegistrationResult("requestId");

        //앱 인증 요청
        RequestAuthResponse requestAuthResponse = externalAuthService.requestAuthentication(
                new IatAppAuthDescriptor(IatAppAuthData.builder()
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()));

        //otp 인증 (directly authentication)
        AuthenticationResponse authenticationResponse = externalAuthService.authenticate(
                new IatOtpAuthDescriptor(IatOtpAuthData.builder()
                        .otpNumber("123123")
                        .requestId(requestAuthResponse.getRequestId())
                        .build()));

        //email 인증 요청 (requestable authentication)
        requestAuthResponse = externalAuthService.requestAuthentication(
                new IatEmailAuthDescriptor(IatEmailAuthData.builder()
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()));

        GetAuthResultResponse getAuthResultResponse = externalAuthService.getAuthenticationResult(
                new IatEmailAuthDescriptor(IatEmailAuthData.builder()
                        .authCode("546456")
                        .requestId(requestAuthResponse.getRequestId())
                        .build()));

        //app 인증 확인
        getAuthResultResponse = externalAuthService.getAuthenticationResult(
                new IatAppAuthDescriptor(IatAppAuthData.builder()
                        .requestId("requestId")
                        .build()));

        //수동 otp 등록 여부 확인
        CheckAuthRegistrationResposne checkAuthRegistrationResposne = externalAuthService.checkAuthRegistration(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .userId("djcho")
                        .build()));

        String iatJwt = externalAuthService.generateJwt("djcho");
        //수동 otp 등록 요청
        RequestAuthRegistrationResponse requestAuthRegistrationResponse = externalAuthService.requestAuthRegistration(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()));

        //수동 otp 등록
        RegisterAuthResponse registerAuthResponse = externalAuthService.registerAuth(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .requestId(requestAuthRegistrationResponse.getRequestId())
                        .otpNumber("123123")
                        .build()));

        //수동 otp 재등록 요청
        RequestReregisterAuthResponse requestReregisterAuthResponse = externalAuthService.requestReregisterAuth(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .userId("djcho")
                        .serviceId("serviceId")
                        .build()));

        //수동 otp 재등록
        ReRegisterAuthResponse reRegisterAuthResponse = externalAuthService.reRegisterAuth(
                new IatManualOtpAuthDescriptor(IatManualOtpAuthData.builder()
                        .jwt(iatJwt)
                        .requestId(requestReregisterAuthResponse.getRequestId())
                        .otpNumber("123123")
                        .build()));
    }
}