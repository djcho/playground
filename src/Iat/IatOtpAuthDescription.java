package Iat;

import ExternalAuth.AuthData;
import ExternalAuth.AuthDescription;

public class IatOtpAuthDescription implements AuthDescription {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthDescription(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }

    @Override
    public AuthData getAuthData() {
        return this.iatOtpAuthData;
    }
}
