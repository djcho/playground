package Iat;
import ExternalAuth.*;

public class IatAuthApi implements ExternalAuthApi {

    public IatAuthApi(){
    }

    @Override
    public AuthenticationResponse authenticate(Authenticator authenticator) {
        return authenticator.authenticate();
    }

    @Override
    public RequestAuthResponse requestAuthentication(RequestableAuthenticator requestableAuthenticator) {
        return requestableAuthenticator.requestAuthentication();
    }

    @Override
    public GetAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator) {
        return requestableAuthenticator.requestAuthenticationResult();
    }

    @Override
    public GetAuthPolicyResponse getAuthPolicy(String userId, String jwt) {
        return null;
    }

    @Override
    public RequestDeviceRegistrationResponse requestDeviceRegistrationQr(String userId, String serviceId, String jwt) {
        return null;
    }

    @Override
    public GetDeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId, String jwt) {
        return null;
    }

    @Override
    public CheckAuthRegistrationResposne checkAuthRegistration(RegisterableAuthenticator registerableAuthenticator) {
        return registerableAuthenticator.checkAuthRegistration();
    }

    @Override
    public RequestAuthRegistrationResponse requestAuthRegistration(RegisterableAuthenticator registerableAuthenticator) {
        return registerableAuthenticator.requestAuthRegistration();
    }

    @Override
    public RegisterAuthResponse registerAuth(RegisterableAuthenticator registerableAuthenticator) {
        return registerableAuthenticator.registerAuth();
    }

    @Override
    public ReRegisterAuthResponse reRegisterAuth(RegisterableAuthenticator registerableAuthenticator) {
        return registerableAuthenticator.reRegisterAuth();
    }

    @Override
    public RequestReregisterAuthResponse requestReregisterAuth(RegisterableAuthenticator registerableAuthenticator) {
        return registerableAuthenticator.requestReregisterAuth();
    }


}
