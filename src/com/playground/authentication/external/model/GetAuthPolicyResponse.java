package com.playground.authentication.external.model;

public interface GetAuthPolicyResponse {
    <T extends AuthPolicy> T getAuthPolicy(Class<T> resultType);
}
