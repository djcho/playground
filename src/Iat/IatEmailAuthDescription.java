package Iat;

import ExternalAuth.AuthDescription;
import lombok.Getter;

@Getter
public class IatEmailAuthDescription implements AuthDescription {
    private IatEmailAuthData iatEmailAuthData;
    public IatEmailAuthDescription(IatEmailAuthData iatEmailAuthData) {
        this.iatEmailAuthData = iatEmailAuthData;
    }
}
