package com.project.Application.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data // All getters and setters, hashcode and equals
@NoArgsConstructor // Empty constructor
@AllArgsConstructor // All args constructor

@Entity
public class Option{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long Id;

     @ManyToOne(fetch=FetchType.LAZY)
     @JoinColumn(name="question_id")
     private Question question;

     @OneToMany(fetch = FetchType.LAZY , mappedBy = "option")
     private List<UserAnswer> userAnswers;

     @Column(name="answer")
     private String answer;

     @Column(name="isCorrect")
     private boolean isCorrect;
}