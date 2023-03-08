package com.playground.authentication.external;


import com.playground.authentication.external.authenticator.AuthData;
import com.playground.authentication.external.authenticator.Authenticator;
import com.playground.authentication.external.authenticator.RegisterableAuthenticator;
import com.playground.authentication.external.authenticator.RequestableAuthenticator;
import com.playground.authentication.external.model.*;

public interface ExternalAuthApi {
    AuthResponse authenticate(Authenticator authenticator, AuthData authData);
    ReqAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator, AuthData authData);
    GetAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator, AuthData authData);
    GetAuthPolicyResponse getAuthPolicy(GetAuthPolicyRequest getAuthPolicyRequest);
    ReqDeviceRegResponse requestDeviceRegistration(ReqDeviceRegRequest reqDeviceRegRequest);
    GetDeviceRegResultResponse requestDeviceRegistrationResult(GetDeviceRegResultRequest getDeviceRegResultRequest);

    CheckedAuthRegResponse checkAuthRegistration(RegisterableAuthenticator registerableAuthenticator, AuthData authData);
    ReqAuthRegResponse requestAuthRegistration(RegisterableAuthenticator registerableAuthenticator, AuthData authData);
    RegAuthResponse registerAuthentication(RegisterableAuthenticator registerableAuthenticator, AuthData authData);
}
