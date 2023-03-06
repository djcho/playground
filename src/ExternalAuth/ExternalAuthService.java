package ExternalAuth;

public interface ExternalAuthService{
    AuthenticationResponse authenticate(AuthDescription authDescription);
    RequestAuthResponse requestAuthentication(AuthDescription authDescription);
    RequestAuthResultResponse requestAuthenticationResult(AuthDescription authDescription);

    AuthPolicy getAuthPolicy(String userId);
    DeviceRegistrationResponse requestDeviceRegistrationQr(String userId);
    DeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId);
}
