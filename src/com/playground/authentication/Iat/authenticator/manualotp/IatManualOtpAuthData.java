package com.playground.authentication.Iat.authenticator.manualotp;

import com.playground.authentication.external.authenticator.AuthData;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatManualOtpAuthData implements AuthData {
    private String userId;
    private String serviceId;
    private String jwt;
    private String otpNumber;
    private String requestId;
}
