package ExternalAuth;


public class ExternalAuthServiceImpl implements ExternalAuthService {
    ExternalAuthApi externalAuthApi;
    AuthenticatorFactory authenticatorFactory;

    public ExternalAuthServiceImpl(ExternalAuthApi externalAuthApi, AuthenticatorFactory authenticatorFactory){
        this.externalAuthApi = externalAuthApi;
        this.authenticatorFactory = authenticatorFactory;
    }

    @Override
    public AuthenticationResponse authenticate(AuthDescriptor authDescriptor) {
        return externalAuthApi.authenticate(authenticatorFactory.createAuthenticator(authDescriptor));
    }

    @Override
    public RequestAuthResponse requestAuthentication(AuthDescriptor authDescriptor) {
        return externalAuthApi.requestAuthentication(authenticatorFactory.createRequestableAuthenticator(authDescriptor));
    }

    @Override
    public GetAuthResultResponse getAuthenticationResult(AuthDescriptor authDescriptor) {
        return externalAuthApi.requestAuthenticationResult(authenticatorFactory.createRequestableAuthenticator(authDescriptor));
    }

    @Override
    public GetAuthPolicyResponse getAuthPolicy(String userId) {
        return externalAuthApi.getAuthPolicy(userId, "jwt");
    }

    @Override
    public RequestDeviceRegistrationResponse requestDeviceRegistration(String userId) {
        return externalAuthApi.requestDeviceRegistrationQr(userId, "serviceId", "jwt");
    }

    @Override
    public GetDeviceRegistrationResultResponse getDeviceRegistrationResult(String requestId) {
        return externalAuthApi.requestDeviceRegistrationResult(requestId, "jwt");
    }

    @Override
    public CheckAuthRegistrationResposne checkAuthRegistration(AuthDescriptor authDescriptor) {
        return externalAuthApi.checkAuthRegistration(authenticatorFactory.createRegisterableAuthenticator(authDescriptor));
    }

    @Override
    public RequestAuthRegistrationResponse requestAuthRegistration(AuthDescriptor authDescriptor) {
        return externalAuthApi.requestAuthRegistration(authenticatorFactory.createRegisterableAuthenticator(authDescriptor));
    }

    @Override
    public RegisterAuthResponse registerAuth(AuthDescriptor authDescriptor) {
        return externalAuthApi.registerAuth(authenticatorFactory.createRegisterableAuthenticator(authDescriptor));
    }

    @Override
    public RequestReregisterAuthResponse requestReregisterAuth(AuthDescriptor authDescriptor) {
        return externalAuthApi.requestReregisterAuth(authenticatorFactory.createRegisterableAuthenticator(authDescriptor));
    }

    @Override
    public ReRegisterAuthResponse reRegisterAuth(AuthDescriptor authDescriptor) {
        return externalAuthApi.reRegisterAuth(authenticatorFactory.createRegisterableAuthenticator(authDescriptor));
    }

    @Override
    public String generateJwt(String userId) {
        return "jwt!";
    }
}
