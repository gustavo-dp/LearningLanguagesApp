package com.project.Application.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data // All getters and setters, hashcode and equals
@NoArgsConstructor // Empty constructor
@AllArgsConstructor // All args constructor

@Entity
public class Attempt{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "attempt")
    private List<UserAnswer> userAnswers;

    @Column(name="score")
    private int score;

    @Column(name="init_date")
    private LocalDateTime initDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

}