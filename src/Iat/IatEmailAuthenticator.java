package Iat;

import ExternalAuth.*;

public class IatEmailAuthenticator implements RequestableAuthenticator {
    private IatEmailAuthData iatEmailAuthData;
    public IatEmailAuthenticator(IatEmailAuthData iatEmailAuthData) {
        this.iatEmailAuthData = iatEmailAuthData;
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
