package Iat;

import ExternalAuth.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatManualOtpAuthDescriptor implements AuthDescriptor {
    private IatManualOtpAuthData iatManualOtpAuthData;

    public IatManualOtpAuthDescriptor(IatManualOtpAuthData iatManualOtpAuthData){
        this.iatManualOtpAuthData = iatManualOtpAuthData;
    }
}
