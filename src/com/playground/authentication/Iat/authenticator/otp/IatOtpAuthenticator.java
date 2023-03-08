package com.playground.authentication.Iat.authenticator.otp;

import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.Authenticator;
import com.playground.authentication.external.model.AuthResponse;

public class IatOtpAuthenticator implements Authenticator {
    public IatOtpAuthenticator() {
    }

    @Override
    public AuthResponse authenticate(AuthData authData) {
        //otp 인증
        return null;
    }
}
