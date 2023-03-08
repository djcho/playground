package com.playground.authentication.Iat.authenticator.otp;

import com.playground.authentication.external.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatOtpAuthDescriptor implements AuthDescriptor {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthDescriptor(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }
}
