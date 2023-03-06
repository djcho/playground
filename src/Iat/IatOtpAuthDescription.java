package Iat;

import ExternalAuth.AuthDescription;
import lombok.Getter;

@Getter
public class IatOtpAuthDescription implements AuthDescription {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthDescription(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }
}
