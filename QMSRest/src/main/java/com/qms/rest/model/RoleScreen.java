package com.qms.rest.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RoleScreen {
    int roleId;
    List<ScreenPermission> screenPermissions;
}
