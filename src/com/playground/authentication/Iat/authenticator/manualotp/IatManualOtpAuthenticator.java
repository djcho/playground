package com.playground.authentication.Iat.authenticator.manualotp;


import com.playground.authentication.Iat.model.IatManualOtpReqAuthRegResult;
import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.RegisterableAuthenticator;
import com.playground.authentication.external.model.*;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class IatManualOtpAuthenticator implements RegisterableAuthenticator {

    @Override
    public AuthResponse authenticate(AuthData authData) {
        return null;
    }

    @Override
    public CheckedAuthRegResponse checkAuthRegistration(AuthData authData) {
        return null;
    }

    @Override
    public ReqAuthRegResponse requestAuthRegistration(AuthData authData) {

        return new ReqAuthRegResponse() {
            @Override
            public <T extends ReqAuthRegResult> T getReqAuthRegResult(Class<T> resultType) {
                return resultType.cast(IatManualOtpReqAuthRegResult.builder()
                        .requestId("requestId")
                        .otpKey("otpKey")
                        .qrCode("qrCode")
                        .build());
            }
        };
    }

    @Override
    public RegAuthResponse registerAuthentication(AuthData authData) {
        return null;
    }
}
