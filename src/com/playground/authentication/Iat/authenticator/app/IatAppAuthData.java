package com.playground.authentication.Iat.authenticator.app;

import lombok.Builder;

@Builder
public class IatAppAuthData {
    private String userId;
    private String serviceId;
    private String requestId;
}
