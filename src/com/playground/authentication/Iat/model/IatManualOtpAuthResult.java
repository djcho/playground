package com.playground.authentication.Iat.model;


import com.playground.authentication.external.model.AuthResult;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatManualOtpAuthResult implements AuthResult {
    private String code;
}
