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
public class UserAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    @JoinColumn(name = "attempt_id")
    private Attempt attempt; // A qual tentativa pertence esta resposta

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question; // A qual pergunta se refere

    @ManyToOne
    @JoinColumn(name = "selected_option_id")
    private Option option; // Qual opção foi escolhida
}
