package com.playground.authentication.external;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
public class GetAuthPolicyRequest {
    private String userId;
    private String jwt;
}
