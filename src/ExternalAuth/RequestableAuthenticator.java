package ExternalAuth;

public interface RequestableAuthenticator extends Authenticator {
    RequestAuthResponse requestAuthentication();
    RequestAuthResultResponse requestAuthenticationResult();
}
