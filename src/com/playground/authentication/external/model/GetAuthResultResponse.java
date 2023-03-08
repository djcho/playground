package com.playground.authentication.external.model;

public interface GetAuthResultResponse {
     <T extends GetAuthResult> T getAuthResult(Class<T> resultType);
}
