package Iat;
import ExternalAuth.*;

public class IatAuthClient implements ExternalAuthClient,
        PolicyBaseClient, DeviceRegistrableClient{

    public IatAuthClient(){
    }

    @Override
    public AuthenticationResponse authenticate(Authenticator authenticator) {
        authenticator.authenticate();
        return null;
    }


    @Override
    public RegistrationResponse registerDevice(RegistrationRequest registrationRequest) {
        return new IatRegistrationResponse();
    }

    @Override
    public ConfirmRegistrationResponse confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest) {
        return new IatConfirmRegistrationResponse();
    }

    @Override
    public AuthPolicy getAuthPolicy() {
        return new IatAuthPolicy();
    }
}
