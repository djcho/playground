package ExternalAuth;

import java.util.HashMap;
import java.util.Map;

public interface AuthenticatorFactory {
    Authenticator create(AuthDescription authDescription);
}
