package com.playground.authentication.Iat.authenticator.email;

import com.playground.authentication.external.authenticator.AuthData;
import lombok.Builder;

import java.util.List;

@Builder
public class IatEmailAuthData implements AuthData {
    private String authCode;
    private String userId;
    private String serviceId;
    private String requestId;
    private boolean sendPushMessage;
    private List<String> authenticationType;
}
