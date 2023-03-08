package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.ReqAuthResult;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class IatAppReqAuthResult implements ReqAuthResult {
    private String requestId;
    private String authenticationQr;
    private List<String> availableAuthenticationType;
    private String qrCode;
    private String resultCode;
}
