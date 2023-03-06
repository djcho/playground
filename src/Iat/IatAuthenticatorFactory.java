package Iat;

import ExternalAuth.AuthDescription;
import ExternalAuth.Authenticator;
import ExternalAuth.AuthenticatorFactory;
import ExternalAuth.RequestableAuthenticator;

public class IatAuthenticatorFactory implements AuthenticatorFactory {
    @Override
    public Authenticator createAuthenticator(AuthDescription authDescription) {
        if(authDescription instanceof IatOtpAuthDescription iatOtpAuthDescription) {
            return new IatOtpAuthenticator(iatOtpAuthDescription.getIatOtpAuthData());
        }
        else if(authDescription instanceof IatEmailAuthDescription iatEmailAuthDescription){
            return new IatEmailAuthenticator(iatEmailAuthDescription.getIatEmailAuthData());
        }
        return null;
    }

    public RequestableAuthenticator createRequestableAuthenticator(AuthDescription authDescription) {
        if(authDescription instanceof IatAppAuthDescription iatAppAuthDescription)
            return new IatAppAuthenticator(iatAppAuthDescription.getIatAppAuthData());
        return null;
    }
}
