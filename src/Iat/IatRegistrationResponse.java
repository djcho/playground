package Iat;

import ExternalAuth.RegistrationResponse;
import lombok.Data;

@Data
public class IatRegistrationResponse implements RegistrationResponse {
    private String qrData;
}
