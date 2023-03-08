package com.playground.authentication.external.model;

public interface ReqAuthRegResponse {
    <T extends ReqAuthRegResult> T getReqAuthRegResult(Class<T> resultType);
}
