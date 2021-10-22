package application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponse {

    private String userId;
    private String message;
    private String refreshToken;
    private String accessToken;
    private String role;
    private String status;
    private String statusCode;
    private String userName;
    private String userEmail;
}
