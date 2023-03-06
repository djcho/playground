package ExternalAuth;


public class ExternalAuthServiceImpl implements ExternalAuthService {
    ExternalAuthApi externalAuthApi;
    AuthenticatorFactory authenticatorFactory;

    public ExternalAuthServiceImpl(ExternalAuthApi externalAuthApi, AuthenticatorFactory authenticatorFactory){
        this.externalAuthApi = externalAuthApi;
        this.authenticatorFactory = authenticatorFactory;
    }

    @Override
    public <T extends AuthPolicy> T getAuthPolicy(Class<T> authPolicyClass) {
        AuthPolicy authPolicy = externalAuthApi.getAuthPolicy();
        if (authPolicyClass.isInstance(authPolicy)) {
            return authPolicyClass.cast(authPolicy);
        } else {
            throw new IllegalArgumentException("Requested auth policy type not found.");
        }
    }

    @Override
    public AuthenticationResponse authenticate(AuthDescription authDescription) {
        return externalAuthApi.authenticate(authenticatorFactory.create(authDescription));
    }

    @Override
    public <T extends RegistrationResponse> T registerDevice(RegistrationRequest registrationRequest, Class<T> responseClass) {
        RegistrationResponse registrationResponse = externalAuthApi.registerDevice(registrationRequest);
        if (responseClass.isInstance(registrationResponse)) {
            return responseClass.cast(registrationResponse);
        } else {
            throw new IllegalArgumentException("Requested RegistrationResponse type not found.");
        }
    }

    @Override
    public <T extends ConfirmRegistrationResponse> T confirmDeviceRegistration(ConfirmRegistrationRequest confirmRegistrationRequest, Class<T> responseClass) {
        ConfirmRegistrationResponse confirmRegistrationResponse = externalAuthApi.confirmDeviceRegistration(confirmRegistrationRequest);
        if (responseClass.isInstance(confirmRegistrationResponse)) {
            return responseClass.cast(confirmRegistrationResponse);
        } else {
            throw new IllegalArgumentException("Requested ConfirmRegistrationResponse type not found.");
        }
    }
}
