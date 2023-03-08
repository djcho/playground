package com.playground.authentication.external.authenticator;

import com.playground.authentication.external.model.CheckedAuthRegResponse;
import com.playground.authentication.external.model.RegAuthResponse;
import com.playground.authentication.external.model.ReqAuthRegResponse;

public interface RegisterableAuthenticator extends Authenticator {
    //등록 여부 확인
    CheckedAuthRegResponse checkAuthRegistration(AuthData authData);

    //등록 요청
    ReqAuthRegResponse requestAuthRegistration(AuthData authData);

    //등록
    RegAuthResponse registerAuthentication(AuthData authData);
}
