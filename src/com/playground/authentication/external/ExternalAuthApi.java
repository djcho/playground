package com.playground.authentication.external;

import com.playground.authentication.external.model.*;

public interface ExternalAuthApi {
    AuthenticationResponse authenticate(Authenticator authenticator);
    RequestAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator);
    GetAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator);
    GetAuthPolicyResponse getAuthPolicy(GetAuthPolicyRequest getAuthPolicyRequest);
    RequestDeviceRegistrationResponse requestDeviceRegistration(RequestDeviceRegistrationRequest requestDeviceRegistrationRequest);
    GetDeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId, String jwt);
    CheckAuthRegistrationResposne checkAuthRegistration(RegisterableAuthenticator registerableAuthenticator);
    RequestAuthRegistrationResponse requestAuthRegistration(RegisterableAuthenticator registerableAuthenticator);
    RegisterAuthResponse registerAuth(RegisterableAuthenticator registerableAuthenticator);
    ReRegisterAuthResponse reRegisterAuth(RegisterableAuthenticator registerableAuthenticator);
    RequestReregisterAuthResponse requestReregisterAuth(RegisterableAuthenticator registerableAuthenticator);
}
