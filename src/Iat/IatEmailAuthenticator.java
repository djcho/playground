package Iat;

import ExternalAuth.AuthenticationResponse;
import ExternalAuth.Authenticator;

public class IatEmailAuthenticator implements Authenticator {
    IatEmailAuthData iatEmailAuthData;
    public IatEmailAuthenticator(IatEmailAuthData iatEmailAuthData) {
        this.iatEmailAuthData = iatEmailAuthData;
    }

    @Override
    public AuthenticationResponse authenticate() {
        return null;
    }
}
