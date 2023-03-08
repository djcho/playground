package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.GetAuthResult;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class IatAppGetAuthResult implements GetAuthResult {
    private String code;
}
