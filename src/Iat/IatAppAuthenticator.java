package Iat;

import ExternalAuth.AuthenticationResponse;
import ExternalAuth.RequestAuthResponse;
import ExternalAuth.RequestAuthResultResponse;
import ExternalAuth.RequestableAuthenticator;
import Iat.IatAppAuthData;

public class IatAppAuthenticator implements RequestableAuthenticator {

    private IatAppAuthData iatAppAuthData;
    public IatAppAuthenticator(IatAppAuthData iatAppAuthData) {
        this.iatAppAuthData = iatAppAuthData;
    }

    @Override
    public AuthenticationResponse authenticate() {

        return null;
    }

    @Override
    public RequestAuthResponse requestAuthentication() {
        return null;
    }

    @Override
    public RequestAuthResultResponse requestAuthenticationResult() {
        return null;
    }
}
