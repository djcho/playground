package com.playground.authentication.external.authenticator;

public abstract class AuthDescriptor {
    protected AuthData authData;

    public AuthDescriptor(AuthData authData){
        this.authData = authData;
    }
    public AuthData getAuthData(){
        return this.authData;
    }
}

