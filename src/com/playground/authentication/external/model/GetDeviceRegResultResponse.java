package com.playground.authentication.external.model;

public interface GetDeviceRegResultResponse {

    <T extends DeviceRegResult> T getDeviceRegResult(Class<T> resultType);
}
