package com.playground.authentication.Iat.authenticator.manualotp;


import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatManualOtpAuthDescriptor extends AuthDescriptor {
    public IatManualOtpAuthDescriptor(AuthData authData) {
        super(authData);
    }
}