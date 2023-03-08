package com.playground.authentication.Iat.authenticator.manualotp;

import com.playground.authentication.external.model.RegisterAuthResponse;
import com.playground.authentication.external.RegisterableAuthenticator;
import com.playground.authentication.external.model.*;

public class IatManualOtpAuthenticator implements RegisterableAuthenticator {
    private IatManualOtpAuthData iatManualOtpAuthData;

    public IatManualOtpAuthenticator(IatManualOtpAuthData iatManualOtpAuthData){
        this.iatManualOtpAuthData = iatManualOtpAuthData;
    }

    @Override
    public AuthenticationResponse authenticate() {
        return null;
    }

    @Override
    public CheckAuthRegistrationResposne checkAuthRegistration() {
        return null;
    }

    @Override
    public RequestAuthRegistrationResponse requestAuthRegistration() {
        return null;
    }

    @Override
    public RegisterAuthResponse registerAuth() {
        return null;
    }

    @Override
    public RequestReregisterAuthResponse requestReregisterAuth() {
        return null;
    }

    @Override
    public ReRegisterAuthResponse reRegisterAuth() {
        return null;
    }
}
