package com.playground.authentication.external.model;

public interface CheckedAuthRegResponse {
    <T extends CheckedAuthRegResult> T getCheckedAuthRegResult(Class<T> resultType);
}
