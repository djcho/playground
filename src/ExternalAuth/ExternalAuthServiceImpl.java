package ExternalAuth;


public class ExternalAuthServiceImpl implements ExternalAuthService {
    ExternalAuthClient externalAuthClient;
    AuthenticatorFactory authenticatorFactory;
    public ExternalAuthServiceImpl(ExternalAuthClient externalAuthClient, AuthenticatorFactory authenticatorFactory){
        this.externalAuthClient = externalAuthClient;
        this.authenticatorFactory = authenticatorFactory;
    }
    @Override
    public <T extends AuthPolicy> T getAuthPolicy(Class<T> authPolicyClass) {
        if (externalAuthClient instanceof PolicyBaseClient) {
            AuthPolicy authPolicy = ((PolicyBaseClient) externalAuthClient).getAuthPolicy();

            if (authPolicyClass.isInstance(authPolicy)) {
                return authPolicyClass.cast(authPolicy);
            } else {
                throw new IllegalArgumentException("Requested auth policy type not found.");
            }
        }

        return null;
    }

    @Override
    public AuthenticationResponse authenticate(AuthDescription authDescription) {
        return externalAuthClient.authenticate(authenticatorFactory.create(authDescription));
    }

    @Override
    public <T extends RegistrationResponse> T registerDevice(RegistrationRequest registrationRequest, Class<T> responseClass) {
        if (externalAuthClient instanceof DeviceRegistrableClient) {
            RegistrationResponse registrationResponse = ((DeviceRegistrableClient) externalAuthClient).registerDevice(registrationRequest);

            if (responseClass.isInstance(registrationResponse)) {
                return responseClass.cast(registrationResponse);
            } else {
                throw new IllegalArgumentException("Requested RegistrationResponse type not found.");
            }
        }
        else {
            return null;
        }
    }

    @Override
    public <T extends ConfirmRegistrationResponse> T confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest, Class<T> responseClass) {
        if (externalAuthClient instanceof DeviceRegistrableClient) {
            ConfirmRegistrationResponse confirmRegistrationResponse = ((DeviceRegistrableClient) externalAuthClient).confirmDeviceRegistration(confirmRegistrationRequest);
            if (responseClass.isInstance(confirmRegistrationResponse)) {
                return responseClass.cast(confirmRegistrationResponse);
            } else {
                throw new IllegalArgumentException("Requested ConfirmRegistrationResponse type not found.");
            }
        }
        else {
            return null;
        }
    }
}
