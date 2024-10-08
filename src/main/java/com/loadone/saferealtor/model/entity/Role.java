package com.loadone.saferealtor.model.entity;

import lombok.extern.log4j.Log4j2;

@Log4j2
public enum Role {
    ROLE_ADMIN("관리자"), // 관리자
    ROLE_AGENT("중개사"), // 중개사
    ROLE_USER("사용자"); // 사용자

    private final String roleDisplayName;

    Role(String roleDisplayName) {
        this.roleDisplayName = roleDisplayName;
    }

    public String getDisplayName() {
        return this.roleDisplayName;
    }
}
