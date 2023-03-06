package ExternalAuth;

public interface ExternalAuthService{
    AuthenticationResponse authenticate(AuthDescription authDescription);
    <T extends AuthPolicy> T getAuthPolicy(Class<T> authPolicyClass);
    <T extends RegistrationResponse> T registerDevice(RegistrationRequest registrationRequest, Class<T> responseClass);
    <T extends ConfirmRegistrationResponse> T confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest, Class<T> responseClass);
}
