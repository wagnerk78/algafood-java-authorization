package com.wagner.kroiss.core;

import com.wagner.kroiss.domain.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import lombok.Getter;

import java.util.Collection;
import java.util.Collections;

@Getter
public class AuthUser extends User {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private String fullName;

    public AuthUser(Usuario usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getEmail(), usuario.getSenha(), authorities);

        this.userId = usuario.getId();
        this.fullName = usuario.getNome();
    }

}
