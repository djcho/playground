package ExternalAuth;

public interface ExternalAuthApi {
    AuthenticationResponse authenticate(Authenticator authenticator);
    RequestAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator);
    GetAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator);
    GetAuthPolicyResponse getAuthPolicy(String userId, String jwt);
    RequestDeviceRegistrationResponse requestDeviceRegistrationQr(String userId, String serviceId, String jwt);
    GetDeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId, String jwt);
    CheckAuthRegistrationResposne checkAuthRegistration(RegisterableAuthenticator registerableAuthenticator);
    RequestAuthRegistrationResponse requestAuthRegistration(RegisterableAuthenticator registerableAuthenticator);
    RegisterAuthResponse registerAuth(RegisterableAuthenticator registerableAuthenticator);
    ReRegisterAuthResponse reRegisterAuth(RegisterableAuthenticator registerableAuthenticator);
    RequestReregisterAuthResponse requestReregisterAuth(RegisterableAuthenticator registerableAuthenticator);
}
