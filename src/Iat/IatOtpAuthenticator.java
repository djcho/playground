package Iat;

import ExternalAuth.AuthData;
import ExternalAuth.Authenticator;

public class IatOtpAuthenticator implements Authenticator {
    public IatOtpAuthenticator(AuthData authData) {
    }

    @Override
    public void authenticate() {
        //otp 인증
    }
}
