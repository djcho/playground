package com.playground.authentication.Iat.authenticator.email;

import com.playground.authentication.external.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatEmailAuthDescriptor implements AuthDescriptor {
    private IatEmailAuthData iatEmailAuthData;
    public IatEmailAuthDescriptor(IatEmailAuthData iatEmailAuthData) {
        this.iatEmailAuthData = iatEmailAuthData;
    }
}
