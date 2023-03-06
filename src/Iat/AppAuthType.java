package Iat;

import ExternalAuth.AuthData;
import ExternalAuth.AuthType;
import ExternalAuth.AuthTypeKey;

public class AppAuthType implements AuthType {
    @Override
    public AuthTypeKey getAuthTypeKey() {
        return null;
    }
}
