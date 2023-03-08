package com.playground.authentication.Iat.model;


import com.playground.authentication.external.model.ReqAuthResult;
import lombok.Getter;

@Getter
public class IatEmailReqAuthResult implements ReqAuthResult {
    private String requestId;
}
