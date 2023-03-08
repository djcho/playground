package com.playground.authentication.Iat.authenticator.manualotp;

import com.playground.authentication.external.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatManualOtpAuthDescriptor implements AuthDescriptor {
    private IatManualOtpAuthData iatManualOtpAuthData;

    public IatManualOtpAuthDescriptor(IatManualOtpAuthData iatManualOtpAuthData){
        this.iatManualOtpAuthData = iatManualOtpAuthData;
    }
}
