package ExternalAuth;

import Iat.IatOtpAuthDescription;
import Iat.IatOtpAuthenticator;

public class IatAuthenticatorFactory implements AuthenticatorFactory{
    @Override
    public Authenticator create(AuthDescription authDescription) {
        if(authDescription instanceof IatOtpAuthDescription iatOtpAuthDescription)
            return new IatOtpAuthenticator(iatOtpAuthDescription.getAuthData());
        return null;
    }
}
