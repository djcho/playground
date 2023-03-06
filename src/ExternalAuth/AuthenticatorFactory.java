package ExternalAuth;

public interface AuthenticatorFactory {
    Authenticator createAuthenticator(AuthDescription authDescription);
    RequestableAuthenticator createRequestableAuthenticator(AuthDescription authDescription);
}
