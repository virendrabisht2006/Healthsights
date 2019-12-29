package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResetPassword {
    String userId;
    String oldPassword;
    String newPassword;
    String conformPassword;
    String emailId;

}
