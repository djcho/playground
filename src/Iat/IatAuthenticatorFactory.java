package Iat;

import ExternalAuth.*;

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
