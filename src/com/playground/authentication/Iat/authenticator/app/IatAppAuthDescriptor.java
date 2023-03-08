package com.playground.authentication.Iat.authenticator.app;

import com.playground.authentication.external.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatAppAuthDescriptor implements AuthDescriptor {
    IatAppAuthData iatAppAuthData;
    public IatAppAuthDescriptor(IatAppAuthData iatAppAuthData) {
        this.iatAppAuthData = iatAppAuthData;
    }
}
