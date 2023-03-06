package Iat;

import ExternalAuth.AuthData;

public class IatOtpAuthData implements AuthData {
    private String otpNumber;
    public IatOtpAuthData(String otpNumber){
        this.otpNumber = otpNumber;
    }
}
