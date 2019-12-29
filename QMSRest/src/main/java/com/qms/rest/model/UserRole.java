package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserRole {
    int userId;
    int roleId;
    String status;
}
