package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleLandingPage {
    String title;
    String description;
    String value;
    String type;
    String roleId;
}
