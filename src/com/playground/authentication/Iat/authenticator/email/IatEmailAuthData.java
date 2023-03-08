package com.playground.authentication.Iat.authenticator.email;

import lombok.Builder;

@Builder
public class IatEmailAuthData {
    private String authCode;
    private String userId;
    private String serviceId;
    private String requestId;
}
