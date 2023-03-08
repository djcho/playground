package com.playground.authentication.external.model;

public interface AuthResponse {
    <T extends AuthResult> T getAuthResult(Class<T> resultType);
}
