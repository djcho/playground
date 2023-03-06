package ExternalAuth;


public class ExternalAuthServiceImpl implements ExternalAuthService {
    ExternalAuthApi externalAuthApi;
    AuthenticatorFactory authenticatorFactory;

    public ExternalAuthServiceImpl(ExternalAuthApi externalAuthApi, AuthenticatorFactory authenticatorFactory){
        this.externalAuthApi = externalAuthApi;
        this.authenticatorFactory = authenticatorFactory;
    }

    @Override
    public AuthenticationResponse authenticate(AuthDescription authDescription) {
        return externalAuthApi.authenticate(authenticatorFactory.createAuthenticator(authDescription));
    }

    @Override
    public RequestAuthResponse requestAuthentication(AuthDescription authDescription) {
        return externalAuthApi.requestAuthentication(authenticatorFactory.createRequestableAuthenticator(authDescription));
    }

    @Override
    public RequestAuthResultResponse requestAuthenticationResult(AuthDescription authDescription) {
        return externalAuthApi.requestAuthenticationResult(authenticatorFactory.createRequestableAuthenticator(authDescription));
    }

    @Override
    public AuthPolicy getAuthPolicy(String userId) {
        return externalAuthApi.getAuthPolicy(userId, "jwt");
    }

    @Override
    public DeviceRegistrationResponse requestDeviceRegistrationQr(String userId) {
        return externalAuthApi.requestDeviceRegistrationQr(userId, "serviceId", "jwt");
    }

    @Override
    public DeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId) {
        return externalAuthApi.requestDeviceRegistrationResult(requestId, "jwt");
    }

}
