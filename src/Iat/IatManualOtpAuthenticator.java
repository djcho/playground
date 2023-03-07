package Iat;

import ExternalAuth.*;

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
