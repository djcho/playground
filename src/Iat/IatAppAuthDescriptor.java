package Iat;

import ExternalAuth.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatAppAuthDescriptor implements AuthDescriptor {
    IatAppAuthData iatAppAuthData;
    public IatAppAuthDescriptor(IatAppAuthData iatAppAuthData) {
        this.iatAppAuthData = iatAppAuthData;
    }
}
