package com.playground.authentication.external.authenticator;

import com.playground.authentication.external.model.AuthResponse;

public interface Authenticator {
    AuthResponse authenticate(AuthData authData);
}
