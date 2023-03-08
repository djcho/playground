package com.playground.authentication.Iat.authenticator.otp;

import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthData;
import com.playground.authentication.external.model.AuthenticationResponse;
import com.playground.authentication.external.Authenticator;

public class IatOtpAuthenticator implements Authenticator {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthenticator(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }

    @Override
    public AuthenticationResponse authenticate() {
        //otp 인증
        return null;
    }
}
