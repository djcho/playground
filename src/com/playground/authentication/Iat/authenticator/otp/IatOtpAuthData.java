package com.playground.authentication.Iat.authenticator.otp;

import lombok.Builder;

@Builder
public class IatOtpAuthData{
    private String otpNumber;
    private String requestId;

}
