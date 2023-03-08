package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.AuthResult;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IatEmailAuthResult implements AuthResult {
    private String code;
}
