package ExternalAuth;

import Iat.IatConfirmRegistrationResponse;

public interface ConfirmRegistrationResponse {
    <T extends ConfirmRegistrationResponse> T getResponse(Class<T> responseType);
}
