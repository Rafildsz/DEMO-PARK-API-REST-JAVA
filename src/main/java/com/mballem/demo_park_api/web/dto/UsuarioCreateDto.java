package com.mballem.demo_park_api.web.dto;

import lombok.*;

@Getter @Setter @NoArgsConstructor @ToString
public class UsuarioCreateDto {

    private String username;
    private String password;
    
}
