package com.app1.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {
    ADMIN("ADMIN"), EMP("EMP"), USER("USER");
    private String value;
}
