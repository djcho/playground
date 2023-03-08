package com.playground.authentication.Iat.authenticator.otp;

import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatOtpAuthDescriptor extends AuthDescriptor {
    public IatOtpAuthDescriptor(AuthData authData) {
        super(authData);
    }
}
