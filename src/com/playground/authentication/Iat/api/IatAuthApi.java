package com.playground.authentication.Iat.api;


import com.playground.authentication.Iat.model.IatAuthPolicy;
import com.playground.authentication.Iat.model.IatReqDeviceRegResult;
import com.playground.authentication.external.ExternalAuthApi;
import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.Authenticator;
import com.playground.authentication.external.authenticator.RegisterableAuthenticator;
import com.playground.authentication.external.authenticator.RequestableAuthenticator;
import com.playground.authentication.external.model.*;

import java.util.Arrays;

public class IatAuthApi implements ExternalAuthApi {

    public IatAuthApi(){
    }

    @Override
    public AuthResponse authenticate(Authenticator authenticator, AuthData authData) {
        return authenticator.authenticate(authData);
    }

    @Override
    public ReqAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator, AuthData authData) {
        return requestableAuthenticator.requestAuthentication(authData);
    }

    @Override
    public GetAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator, AuthData authData) {
        return requestableAuthenticator.requestAuthenticationResult(authData);
    }

    @Override
    public GetAuthPolicyResponse getAuthPolicy(GetAuthPolicyRequest getAuthPolicyRequest) {
        return new GetAuthPolicyResponse(){
            @Override
            public <T extends AuthPolicy> T getAuthPolicy(Class<T> resultType) {
                return resultType.cast(
                        IatAuthPolicy.builder()
                                .isPossibleSendMailForEmailAuth(false)
                                .authenticationTypeList(Arrays.asList("", ""))
                                .isDeviceRegistered(false)
                                .build());
            }
        };
    }

    @Override
    public ReqDeviceRegResponse requestDeviceRegistration(ReqDeviceRegRequest reqDeviceRegRequest) {
        return new ReqDeviceRegResponse() {
            @Override
            public <T extends ReqDeviceRegResult> T getReqDeviceRegResult(Class<T> resultType) {
                return resultType.cast(IatReqDeviceRegResult.builder()
                        .build()
                );
            }
        };
    }

    @Override
    public GetDeviceRegResultResponse requestDeviceRegistrationResult(GetDeviceRegResultRequest getDeviceRegResultRequest) {
        return null;
    }

    @Override
    public CheckedAuthRegResponse checkAuthRegistration(RegisterableAuthenticator registerableAuthenticator, AuthData authData) {
        return registerableAuthenticator.checkAuthRegistration(authData);
    }

    @Override
    public ReqAuthRegResponse requestAuthRegistration(RegisterableAuthenticator registerableAuthenticator, AuthData authData) {
        return registerableAuthenticator.requestAuthRegistration(authData);
    }

    @Override
    public RegAuthResponse registerAuthentication(RegisterableAuthenticator registerableAuthenticator, AuthData authData) {
        return registerableAuthenticator.registerAuthentication(authData);
    }
}
