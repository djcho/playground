package com.playground.authentication.external;

public interface AuthenticatorFactory {
    Authenticator createAuthenticator(AuthDescriptor authDescriptor);
    RequestableAuthenticator createRequestableAuthenticator(AuthDescriptor authDescriptor);

    RegisterableAuthenticator createRegisterableAuthenticator(AuthDescriptor authDescriptor);
}
