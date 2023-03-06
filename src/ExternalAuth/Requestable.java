package ExternalAuth;

public interface Requestable {
    void requestAuth(AuthType authType);
    void checkRequestAuthResult(AuthType authType);
}
