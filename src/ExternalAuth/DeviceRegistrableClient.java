package ExternalAuth;

public interface DeviceRegistrableClient {
    RegistrationResponse registerDevice(RegistrationRequest registrationRequest);
    ConfirmRegistrationResponse confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest);
}
