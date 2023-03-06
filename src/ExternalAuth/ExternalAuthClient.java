package ExternalAuth;

public interface ExternalAuthClient {
    AuthenticationResponse authenticate(Authenticator authenticator);

}
