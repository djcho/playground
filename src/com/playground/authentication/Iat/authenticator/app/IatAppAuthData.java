package com.playground.authentication.Iat.authenticator.app;

import com.playground.authentication.external.authenticator.AuthData;
import lombok.Builder;

import java.util.List;

@Builder
public class IatAppAuthData implements AuthData {
    private String userId;
    private String serviceId;
    private String requestId;
    private boolean sendPushMessage;
    private List<String> authenticationList;
}
