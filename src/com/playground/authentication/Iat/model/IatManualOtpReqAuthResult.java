package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.ReqAuthResult;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatManualOtpReqAuthResult implements ReqAuthResult {
    private String requestId;
}
