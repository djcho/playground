package com.playground.authentication.external;


import com.playground.authentication.external.model.AuthenticationResponse;

public interface Authenticator {
    AuthenticationResponse authenticate();
}
