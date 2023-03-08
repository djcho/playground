package com.playground.authentication.Iat.model;


import com.playground.authentication.external.model.ReqAuthRegResult;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class IatManualOtpReqAuthRegResult implements ReqAuthRegResult {
    private String requestId;
    private String otpKey;
    private String qrCode;
}
