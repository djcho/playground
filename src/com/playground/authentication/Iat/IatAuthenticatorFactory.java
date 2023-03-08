package com.playground.authentication.Iat;

import com.playground.authentication.Iat.authenticator.app.IatAppAuthenticator;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthenticator;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthenticator;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthenticator;
import com.playground.authentication.Iat.authenticator.app.IatAppAuthDescriptor;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthDescriptor;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthDescriptor;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthDescriptor;
import com.playground.authentication.external.*;

public class IatAuthenticatorFactory implements AuthenticatorFactory {
    @Override
    public Authenticator createAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatOtpAuthDescriptor iatOtpAuthDescription) {
            return new IatOtpAuthenticator(iatOtpAuthDescription.getIatOtpAuthData());
        }

        return null;
    }

    public RequestableAuthenticator createRequestableAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatAppAuthDescriptor iatAppAuthDescription)
            return new IatAppAuthenticator(iatAppAuthDescription.getIatAppAuthData());
        else if(authDescriptor instanceof IatEmailAuthDescriptor iatEmailAuthDescription){
            return new IatEmailAuthenticator(iatEmailAuthDescription.getIatEmailAuthData());
        }
        return null;
    }

    @Override
    public RegisterableAuthenticator createRegisterableAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatManualOtpAuthDescriptor iatManualOtpAuthDescriptor) {
            return new IatManualOtpAuthenticator(iatManualOtpAuthDescriptor.getIatManualOtpAuthData());
        }
        return null;
    }
}
