package com.playground.authentication.external.authenticator;

import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.model.ReqAuthResponse;

public interface RequestableAuthenticator {
    ReqAuthResponse requestAuthentication(AuthData authData);
    GetAuthResultResponse requestAuthenticationResult(AuthData authData);
}
