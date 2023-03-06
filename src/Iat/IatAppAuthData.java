package Iat;

import lombok.Builder;

@Builder
public class IatAppAuthData {
    private String userId;
    private String serviceId;
    private String requestId;
}
