package Iat;

import ExternalAuth.AuthenticationResponse;
import ExternalAuth.Authenticator;

public class IatOtpAuthenticator implements Authenticator {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthenticator(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }

    @Override
    public AuthenticationResponse authenticate() {
        //otp 인증
        return null;
    }
}
