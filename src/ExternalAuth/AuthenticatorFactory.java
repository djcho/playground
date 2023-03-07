package ExternalAuth;

public interface AuthenticatorFactory {
    Authenticator createAuthenticator(AuthDescriptor authDescriptor);
    RequestableAuthenticator createRequestableAuthenticator(AuthDescriptor authDescriptor);

    RegisterableAuthenticator createRegisterableAuthenticator(AuthDescriptor authDescriptor);
}
