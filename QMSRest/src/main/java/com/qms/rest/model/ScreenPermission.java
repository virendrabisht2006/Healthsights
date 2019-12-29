package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ScreenPermission {
    int screenId;
    String read;
    String write;
    String download;
    String favourites;
}
