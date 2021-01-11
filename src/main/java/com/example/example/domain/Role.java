package com.example.example.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthoritiesContainer;

public enum Role implements GrantedAuthority {
    USER,ADMIN;
    public Role[] getEnum(){
        return Role.values();
    }
    @Override
    public String getAuthority() {
        return name();
    }
}
