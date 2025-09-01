package com.project.Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // All getters and setters, hashcode and equals
@NoArgsConstructor // Empty constructor
@AllArgsConstructor // All args constructor

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long Id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="quiz_id")
    private Quiz quiz;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "question", cascade = CascadeType.ALL)
    private List<Option> options;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "question", cascade = CascadeType.ALL)
    private List<UserAnswer> userAnswers;

    @Column(name="text")
    private String text;

    @Column(name="explanation")
    private String explanation;




}