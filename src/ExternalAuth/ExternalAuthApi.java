package ExternalAuth;

public interface ExternalAuthApi {
    AuthenticationResponse authenticate(Authenticator authenticator);
    RequestAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator);
    RequestAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator);
    AuthPolicy getAuthPolicy(String userId, String jwt);
    DeviceRegistrationResponse requestDeviceRegistrationQr(String userId, String serviceId, String jwt);
    DeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId, String jwt);

}
