package com.project.Application.dto.resquest;

import com.project.Application.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Role is required")
    private String role;

    @NotBlank(message = "Level is required")
    private String level;

    @NotNull(message = "XP is required")
    private Integer xp;

    // Converte DTO em entidade
    public User toEntity() {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setRole(role);
        user.setLevel(level);
        user.setXp(xp);
        user.setRegisterDate(java.time.LocalDateTime.now()); // define data de registro
        return user;
    }

}
