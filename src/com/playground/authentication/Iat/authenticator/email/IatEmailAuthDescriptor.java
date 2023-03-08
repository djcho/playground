package com.playground.authentication.Iat.authenticator.email;

import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatEmailAuthDescriptor extends AuthDescriptor {
    public IatEmailAuthDescriptor(AuthData authData) {
        super(authData);
    }
}
