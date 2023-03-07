package Iat;

import ExternalAuth.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatOtpAuthDescriptor implements AuthDescriptor {
    IatOtpAuthData iatOtpAuthData;
    public IatOtpAuthDescriptor(IatOtpAuthData iatOtpAuthData) {
        this.iatOtpAuthData = iatOtpAuthData;
    }
}
