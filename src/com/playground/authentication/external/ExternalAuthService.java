package com.playground.authentication.external;

import com.playground.authentication.external.model.*;

public interface ExternalAuthService{
    AuthenticationResponse authenticate(AuthDescriptor authDescriptor);
    RequestAuthResponse requestAuthentication(AuthDescriptor authDescriptor);
    GetAuthResultResponse getAuthenticationResult(AuthDescriptor authDescriptor);
    GetAuthPolicyResponse getAuthPolicy(String userId);
    RequestDeviceRegistrationResponse requestDeviceRegistration(String userId);
    GetDeviceRegistrationResultResponse getDeviceRegistrationResult(String requestId);
    CheckAuthRegistrationResposne checkAuthRegistration(AuthDescriptor authDescriptor);
    RequestAuthRegistrationResponse requestAuthRegistration(AuthDescriptor authDescriptor);
    RegisterAuthResponse registerAuth(AuthDescriptor authDescriptor);
    RequestReregisterAuthResponse requestReregisterAuth(AuthDescriptor authDescriptor);
    ReRegisterAuthResponse reRegisterAuth(AuthDescriptor authDescriptor);
    String generateJwt(String userId);
}
