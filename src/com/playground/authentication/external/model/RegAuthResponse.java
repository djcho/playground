package com.playground.authentication.external.model;

public interface RegAuthResponse {
    <T extends RegAuthResult> T getRegAuthResult(Class<T> resultType);
}
