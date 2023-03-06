package ExternalAuth;

public interface ExternalAuthApi {
    AuthenticationResponse authenticate(Authenticator authenticator);
    AuthPolicy getAuthPolicy();
    RegistrationResponse registerDevice(RegistrationRequest registrationRequest);
    ConfirmRegistrationResponse confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest);

}
