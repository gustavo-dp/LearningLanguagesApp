package com.project.Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data // All getters and setters, hashcode and equals
@NoArgsConstructor // Empty constructor
@AllArgsConstructor // All args constructor

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long Id;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="email", unique=true, nullable=false)
    private String email;

    @Column(name="password",  nullable=false)
    private String password;

    @Column(name="role",  nullable=false)
    private String role;

    @Column(name="level", nullable=false)
    private String level;

    @Column(name="xp")
    private Integer xp;

    @Column(name="register_date")
    private LocalDateTime registerDate;

}
