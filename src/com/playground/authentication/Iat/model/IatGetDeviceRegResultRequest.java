package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.GetDeviceRegResultRequest;
import lombok.Builder;

@Builder
public class IatGetDeviceRegResultRequest implements GetDeviceRegResultRequest {
    private String requestId;
    private String jwt;
}
