package com.playground.authentication.Iat.authenticator.manualotp;

import lombok.Builder;

@Builder
public class IatManualOtpAuthData {
    private String userId;
    private String serviceId;
    private String jwt;
    private String otpNumber;
    private String requestId;
}
