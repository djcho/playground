package Iat;

import lombok.Builder;

@Builder
public class IatOtpAuthData{
    private String otpNumber;
    private String requestId;

}
