package com.playground.authentication.Iat.authenticator.otp;

import com.playground.authentication.external.authenticator.AuthData;
import lombok.Builder;

@Builder
public class IatOtpAuthData implements AuthData {
    private String otpNumber;
    private String requestId;

}
