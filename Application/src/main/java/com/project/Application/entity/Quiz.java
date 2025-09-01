package com.project.Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data // All getters and setters, hashcode and equals
@NoArgsConstructor // Empty constructor
@AllArgsConstructor // All args constructor

@Entity
public class Quiz{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    private Long Id;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "quiz",  fetch=FetchType.LAZY)
    private List<Question> questions = new ArrayList<>();

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "quiz", fetch=FetchType.LAZY)
    private List<Attempt> attempts = new ArrayList<>();

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="difficulty")
    private String difficultyLevel;


}