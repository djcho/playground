package com.playground.authentication.external;

import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.model.RequestAuthResponse;

public interface RequestableAuthenticator {
    RequestAuthResponse requestAuthentication();
    GetAuthResultResponse requestAuthenticationResult();
}
