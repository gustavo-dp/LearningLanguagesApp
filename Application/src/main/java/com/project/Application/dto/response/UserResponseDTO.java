package com.project.Application.dto.response;

import com.project.Application.entity.User;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UserResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String role;
    private String level;
    private Integer xp;
    private LocalDateTime registerDate;

    // Construtor que converte a entidade em DTO
    public UserResponseDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.role = user.getRole();
        this.level = user.getLevel();
        this.xp = user.getXp();
        this.registerDate = user.getRegisterDate();
    }
}
