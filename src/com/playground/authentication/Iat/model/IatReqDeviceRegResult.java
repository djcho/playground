package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.ReqDeviceRegResult;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatReqDeviceRegResult implements ReqDeviceRegResult {
    private String requestId;
    private String requestQr;
}
