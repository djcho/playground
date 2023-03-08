package com.playground.authentication.Iat.authenticator.app;

import com.playground.authentication.Iat.model.IatAppGetAuthResult;
import com.playground.authentication.Iat.model.IatAppReqAuthResult;
import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.RequestableAuthenticator;
import com.playground.authentication.external.model.GetAuthResult;
import com.playground.authentication.external.model.GetAuthResultResponse;
import com.playground.authentication.external.model.ReqAuthResponse;
import com.playground.authentication.external.model.ReqAuthResult;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor
public class IatAppAuthenticator implements RequestableAuthenticator {

    @Override
    public ReqAuthResponse requestAuthentication(AuthData authData) {
        return new ReqAuthResponse() {
            @Override
            public <T extends ReqAuthResult> T getRequestAuthResult(Class<T> resultType) {
                return resultType.cast(IatAppReqAuthResult.builder()
                        .requestId("requestId")
                        .authenticationQr("authenticationQr")
                        .availableAuthenticationType(Arrays.asList("", ""))
                        .qrCode("qrCode")
                        .resultCode("resultCode")
                        .build());
            }
        };
    }

    @Override
    public GetAuthResultResponse requestAuthenticationResult(AuthData authData) {
        return new GetAuthResultResponse() {
            @Override
            public <T extends GetAuthResult> T getAuthResult(Class<T> resultType) {
                return resultType.cast(IatAppGetAuthResult.builder()
                        .build());
            }
        };
    }
}
