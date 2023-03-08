package com.playground.authentication.Iat.authenticator.email;

import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.model.RequestAuthResponse;
import com.playground.authentication.external.RequestableAuthenticator;

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
