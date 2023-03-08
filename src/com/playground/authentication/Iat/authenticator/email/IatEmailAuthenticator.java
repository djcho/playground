package com.playground.authentication.Iat.authenticator.email;

import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.Authenticator;
import com.playground.authentication.external.authenticator.RequestableAuthenticator;
import com.playground.authentication.external.model.AuthResponse;
import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.model.ReqAuthResponse;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IatEmailAuthenticator implements RequestableAuthenticator, Authenticator {

    @Override
    public AuthResponse authenticate(AuthData authData) {
        return null;
    }

    @Override
    public ReqAuthResponse requestAuthentication(AuthData authData) {
        return null;
    }

    @Override
    public GetAuthResultResponse requestAuthenticationResult(AuthData authData) {
        return null;
    }
}
