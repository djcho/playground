package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.AuthPolicy;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class IatAuthPolicy implements AuthPolicy {
    private List<String> authenticationTypeList;
    private boolean isPossibleSendMailForEmailAuth;
    private boolean isDeviceRegistered;
}
