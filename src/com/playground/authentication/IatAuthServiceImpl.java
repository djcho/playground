package com.playground.authentication;

import com.playground.authentication.Iat.model.IatGetAuthPolicyRequest;
import com.playground.authentication.Iat.model.IatGetDeviceRegResultRequest;
import com.playground.authentication.Iat.model.IatReqDeviceRegRequest;
import com.playground.authentication.external.ExternalAuthApi;
import com.playground.authentication.external.ExternalAuthService;
import com.playground.authentication.external.authenticator.AuthDescriptor;
import com.playground.authentication.external.authenticator.AuthenticatorFactory;
import com.playground.authentication.external.model.*;


public class IatAuthServiceImpl implements ExternalAuthService {
    private final ExternalAuthApi externalAuthApi;
    private final AuthenticatorFactory authenticatorFactory;

    public IatAuthServiceImpl(ExternalAuthApi externalAuthApi, AuthenticatorFactory authenticatorFactory){
        this.externalAuthApi = externalAuthApi;
        this.authenticatorFactory = authenticatorFactory;
    }

    @Override
    public <T extends AuthResult> T authenticate(AuthDescriptor authDescriptor, Class<T> resultType) {
        AuthResponse response =  externalAuthApi.authenticate(authenticatorFactory.createAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getAuthResult(resultType);
    }

    @Override
    public <T extends ReqAuthResult> T requestAuthentication(AuthDescriptor authDescriptor, Class<T> resultType) {
        ReqAuthResponse response = externalAuthApi.requestAuthentication(
                authenticatorFactory.createRequestableAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getRequestAuthResult(resultType);
    }

    @Override
    public <T extends GetAuthResult> T getAuthenticationResult(AuthDescriptor authDescriptor, Class<T> resultType) {
        GetAuthResultResponse response = externalAuthApi.requestAuthenticationResult(
                authenticatorFactory.createRequestableAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getAuthResult(resultType);
    }

    @Override
    public <T extends AuthPolicy> T getAuthPolicy(String userId, Class<T> resultType) {
        GetAuthPolicyResponse response = externalAuthApi.getAuthPolicy(IatGetAuthPolicyRequest.builder()
                .userId(userId)
                .jwt(genUserAuthorizationToken(userId))
                .build());

        return response.getAuthPolicy(resultType);
    }

    @Override
    public <T extends ReqDeviceRegResult> T requestDeviceRegistration(String userId, Class<T> resultType) {
        ReqDeviceRegResponse response = externalAuthApi.requestDeviceRegistration(
                IatReqDeviceRegRequest.builder()
                        .userId(userId)
                        .jwt(genUserAuthorizationToken(userId))
                        .build());

        return response.getReqDeviceRegResult(resultType);
    }

    @Override
    public <T extends DeviceRegResult> T getDeviceRegistrationResult(String userId, String requestId, Class<T> resultType) {
        GetDeviceRegResultResponse response = externalAuthApi.requestDeviceRegistrationResult(
                IatGetDeviceRegResultRequest.builder()
                        .requestId(requestId)
                        .jwt(genUserAuthorizationToken(userId))
                        .build());

        return response.getDeviceRegResult(resultType);
    }

    @Override
    public <T extends CheckedAuthRegResult> T checkAuthRegistration(AuthDescriptor authDescriptor, Class<T> resultType) {
        CheckedAuthRegResponse response = externalAuthApi.checkAuthRegistration(
                authenticatorFactory.createRegisterableAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getCheckedAuthRegResult(resultType);
    }

    @Override
    public <T extends ReqAuthRegResult> T requestAuthRegistration(AuthDescriptor authDescriptor, Class<T> resultType) {
        ReqAuthRegResponse response =  externalAuthApi.requestAuthRegistration(
                authenticatorFactory.createRegisterableAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getReqAuthRegResult(resultType);
    }

    @Override
    public <T extends RegAuthResult> T registerAuthentication(AuthDescriptor authDescriptor, Class<T> resultType) {
        RegAuthResponse response = externalAuthApi.registerAuthentication(authenticatorFactory.createRegisterableAuthenticator(authDescriptor),
                authDescriptor.getAuthData());

        return response.getRegAuthResult(resultType);
    }

    @Override
    public String genUserAuthorizationToken(String userId) {
        return "jwt";
    }
}
