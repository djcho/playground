package Iat;

import lombok.Builder;

@Builder
public class IatEmailAuthData {
    private String authCode;
    private String requestId;
}
