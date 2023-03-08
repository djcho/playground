package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.GetAuthPolicyRequest;
import lombok.Builder;

@Builder
public class IatGetAuthPolicyRequest implements GetAuthPolicyRequest {
    String userId;
    String jwt;
}
