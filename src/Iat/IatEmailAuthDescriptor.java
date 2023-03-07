package Iat;

import ExternalAuth.AuthDescriptor;
import lombok.Getter;

@Getter
public class IatEmailAuthDescriptor implements AuthDescriptor {
    private IatEmailAuthData iatEmailAuthData;
    public IatEmailAuthDescriptor(IatEmailAuthData iatEmailAuthData) {
        this.iatEmailAuthData = iatEmailAuthData;
    }
}
