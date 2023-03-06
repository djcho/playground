package Iat;

import ExternalAuth.ConfirmRegistrationResponse;
import ExternalAuth.RegistrationResponse;

public class IatConfirmRegistrationResponse implements ConfirmRegistrationResponse {
    @Override
    public <T extends ConfirmRegistrationResponse> T getResponse(Class<T> responseType) {
        if (responseType.isAssignableFrom(IatConfirmRegistrationResponse.class)) {
            return responseType.cast(this);
        } else {
            // Handle other response types if necessary
            return null;
        }
    }
}
