package com.playground.authentication.external.model;

public interface ReqAuthResponse {
    <T extends ReqAuthResult> T getRequestAuthResult(Class<T> resultType);
}
