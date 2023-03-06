import ExternalAuth.*;
import Iat.*;

public class Main {

    public static void main(String[] args) {
        ExternalAuthService externalAuthService = new ExternalAuthServiceImpl(new IatAuthApi(), new IatAuthenticatorFactory());
        IatAuthPolicy iatAuthPolicy = externalAuthService.getAuthPolicy(IatAuthPolicy.class);

        //기기 등록
        IatRegistrationResponse iatRegistrationResponse = externalAuthService.registerDevice(
                new IatRegistrationRequest("jwt", "serviceUserId", "serviceId"),
                IatRegistrationResponse.class);
        String qrData = iatRegistrationResponse.getQrData();

        IatConfirmRegistrationResponse iatConfirmRegistrationResponse = externalAuthService.confirmDeviceRegistration(
                new IatConfirmRegistrationRequest("requestId"),
                IatConfirmRegistrationResponse.class);

        //otp 인증
        externalAuthService.authenticate(new IatOtpAuthDescription(new IatOtpAuthData("123123")));


    }
}