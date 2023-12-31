package com.conseller.conseller.user.dto.response;

import lombok.*;

@Builder
@Getter @Setter @ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class LoginResponse {

    private Long userIdx;
    private String userNickname;
    private String accessToken;
    private String refreshToken;
}
