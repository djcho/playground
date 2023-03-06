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
    public RequestAuthResultResponse requestAuthenticationResult(RequestableAuthenticator requestableAuthenticator) {
        return requestableAuthenticator.requestAuthenticationResult();
    }

    @Override
    public AuthPolicy getAuthPolicy(String userId, String jwt) {
        return null;
    }

    @Override
    public DeviceRegistrationResponse requestDeviceRegistrationQr(String userId, String serviceId, String jwt) {
        return null;
    }

    @Override
    public DeviceRegistrationResultResponse requestDeviceRegistrationResult(String requestId, String jwt) {
        return null;
    }


}
