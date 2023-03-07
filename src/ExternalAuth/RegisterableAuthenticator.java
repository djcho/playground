package ExternalAuth;

public interface RegisterableAuthenticator extends Authenticator {
    //등록 여부 확인
    CheckAuthRegistrationResposne checkAuthRegistration();

    //등록 요청
    RequestAuthRegistrationResponse requestAuthRegistration();

    //등록
    RegisterAuthResponse registerAuth();

    //재등록 요청
    RequestReregisterAuthResponse requestReregisterAuth();

    //재등록
    ReRegisterAuthResponse reRegisterAuth();
}
