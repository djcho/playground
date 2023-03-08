package com.playground.authentication.external.model;

public interface ReqDeviceRegResponse {
    <T extends ReqDeviceRegResult> T getReqDeviceRegResult(Class<T> resultType);
}
