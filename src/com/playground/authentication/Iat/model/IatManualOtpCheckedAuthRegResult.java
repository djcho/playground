package com.playground.authentication.Iat.model;

import com.playground.authentication.external.model.CheckedAuthRegResult;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatManualOtpCheckedAuthRegResult implements CheckedAuthRegResult {
    private String isRegistered;
}
