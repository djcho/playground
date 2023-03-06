package Iat;

import ExternalAuth.AuthPolicy;
import ExternalAuth.AuthType;
import ExternalAuth.AuthTypeKey;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
public class IatAuthPolicy implements AuthPolicy {
    private List<String> iatAuthTypeList = new ArrayList<>();
    private boolean isRegisterDevice;

    public void addAuthType(String authType){
        this.iatAuthTypeList.add(authType);
    }
}
