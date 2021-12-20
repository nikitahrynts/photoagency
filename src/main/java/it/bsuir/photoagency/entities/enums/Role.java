package it.bsuir.photoagency.entities.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_USER, ROLE_ADMIN/*, ROLE_VIEWER*/;

    @Override
    public String getAuthority() {
        return name();
    }
}
