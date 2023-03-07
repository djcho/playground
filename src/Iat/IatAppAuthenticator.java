package Iat;

import ExternalAuth.RequestAuthResponse;
import ExternalAuth.GetAuthResultResponse;
import ExternalAuth.RequestableAuthenticator;

public class IatAppAuthenticator implements RequestableAuthenticator {

    private IatAppAuthData iatAppAuthData;
    public IatAppAuthenticator(IatAppAuthData iatAppAuthData) {
        this.iatAppAuthData = iatAppAuthData;
    }

    @Override
    public RequestAuthResponse requestAuthentication() {
        return null;
    }

    @Override
    public GetAuthResultResponse requestAuthenticationResult() {
        return null;
    }
}
