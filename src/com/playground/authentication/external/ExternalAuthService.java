package com.playground.authentication.external;

import com.playground.authentication.external.authenticator.AuthDescriptor;
import com.playground.authentication.external.model.*;

public interface ExternalAuthService{
    <T extends AuthResult> T authenticate(AuthDescriptor authDescriptor, Class<T> resultType);
    <T extends ReqAuthResult> T requestAuthentication(AuthDescriptor authDescriptor, Class<T> resultType);
    <T extends GetAuthResult> T getAuthenticationResult(AuthDescriptor authDescriptor, Class<T> resultType) ;
    <T extends AuthPolicy> T getAuthPolicy(String userId, Class<T> resultType);
    <T extends ReqDeviceRegResult> T requestDeviceRegistration(String userId, Class<T> resultType);
    <T extends DeviceRegResult> T getDeviceRegistrationResult(String userId, String requestId, Class<T> resultType);
    <T extends CheckedAuthRegResult> T checkAuthRegistration(AuthDescriptor authDescriptor, Class<T> resultType);
    <T extends ReqAuthRegResult> T requestAuthRegistration(AuthDescriptor authDescriptor, Class<T> resultType);
    <T extends RegAuthResult> T registerAuthentication(AuthDescriptor authDescriptor, Class<T> resultType);
    String genUserAuthorizationToken(String userId);
}
