package ExternalAuth;

public interface RequestableAuthenticator {
    RequestAuthResponse requestAuthentication();
    GetAuthResultResponse requestAuthenticationResult();
}
