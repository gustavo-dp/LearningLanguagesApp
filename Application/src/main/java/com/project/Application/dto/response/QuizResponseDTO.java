package com.project.Application.dto.response;

import com.project.Application.entity.Quiz;

import java.util.List;
import java.util.stream.Collectors;

public class QuizResponseDTO {
    private Long Id;
    private List<QuestionResponseDTO> questions;
    private List<AttemptResponseDTO> attempts;
    private String title;
    private String description;
    private String difficultyLevel;

    public QuizResponseDTO(Quiz quiz) {
        this.Id = quiz.getId();
        this.questions = quiz.getQuestions().stream().map(QuestionResponseDTO::new).collect(Collectors.toList());
        this.attempts = quiz.getAttempts().stream().map(AttemptResponseDTO::new).collect(Collectors.toList());
        this.title = quiz.getTitle();
        this.description = quiz.getDescription();
        this.difficultyLevel = quiz.getDifficultyLevel();
    }
}
