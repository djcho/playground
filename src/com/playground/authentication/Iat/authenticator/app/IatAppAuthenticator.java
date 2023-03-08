package com.playground.authentication.Iat.authenticator.app;

import com.playground.authentication.external.model.RequestAuthResponse;
import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.RequestableAuthenticator;

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
