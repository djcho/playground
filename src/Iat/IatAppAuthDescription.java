package Iat;

import ExternalAuth.AuthDescription;
import Iat.IatAppAuthData;
import lombok.Getter;

@Getter
public class IatAppAuthDescription implements AuthDescription {
    IatAppAuthData iatAppAuthData;
    public IatAppAuthDescription(IatAppAuthData iatAppAuthData) {
        this.iatAppAuthData = iatAppAuthData;
    }
}
