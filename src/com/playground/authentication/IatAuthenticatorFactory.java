package com.playground.authentication;


import com.playground.authentication.Iat.authenticator.app.IatAppAuthDescriptor;
import com.playground.authentication.Iat.authenticator.app.IatAppAuthenticator;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthDescriptor;
import com.playground.authentication.Iat.authenticator.email.IatEmailAuthenticator;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthDescriptor;
import com.playground.authentication.Iat.authenticator.manualotp.IatManualOtpAuthenticator;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthDescriptor;
import com.playground.authentication.Iat.authenticator.otp.IatOtpAuthenticator;
import com.playground.authentication.external.authenticator.*;

public class IatAuthenticatorFactory implements AuthenticatorFactory {
    @Override
    public Authenticator createAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatOtpAuthDescriptor) {
            return new IatOtpAuthenticator();
        }else if(authDescriptor instanceof IatEmailAuthDescriptor) {
            return new IatEmailAuthenticator();
        }
        return null;
    }

    public RequestableAuthenticator createRequestableAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatAppAuthDescriptor)
            return new IatAppAuthenticator();
        else if(authDescriptor instanceof IatEmailAuthDescriptor){
            return new IatEmailAuthenticator();
        }
        return null;
    }

    @Override
    public RegisterableAuthenticator createRegisterableAuthenticator(AuthDescriptor authDescriptor) {
        if(authDescriptor instanceof IatManualOtpAuthDescriptor) {
            return new IatManualOtpAuthenticator();
        }
        return null;
    }
}
