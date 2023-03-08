package com.playground.authentication.Iat.authenticator.app;

import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatAppAuthDescriptor extends AuthDescriptor {
    public IatAppAuthDescriptor(AuthData authData) {
        super(authData);
    }
}
