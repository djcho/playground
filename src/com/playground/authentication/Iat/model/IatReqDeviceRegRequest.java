package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.ReqDeviceRegRequest;
import lombok.Builder;

@Builder
public class IatReqDeviceRegRequest implements ReqDeviceRegRequest {
    private String userId;
    private String jwt;
}
