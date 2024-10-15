package com.wagner.kroiss.core;

import com.wagner.kroiss.domain.Usuario;
import org.springframework.security.core.userdetails.User;
import lombok.Getter;

import java.util.Collections;

@Getter
public class AuthUser extends User {

    private static final long serialVersionUID = 1L;

    private Long userId;
    private String fullName;

    public AuthUser(Usuario usuario) {
        super(usuario.getEmail(), usuario.getSenha(), Collections.emptyList());

        this.userId = usuario.getId();
        this.fullName = usuario.getNome();
    }

}
