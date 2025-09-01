package com.project.Application.dto.response;

import com.project.Application.entity.Attempt;
import com.project.Application.entity.Quiz;
import com.project.Application.entity.User;
import com.project.Application.entity.UserAnswer;

import java.time.LocalDateTime;
import java.util.List;

public class AttemptResponseDTO {

    private Long id;
    private int score;
    private LocalDateTime initDate;
    private LocalDateTime endDate;
    private QuizResponseDTO quiz;
    private UserResponseDTO user;
    private List<UserAnswerResponseDTO> userAnswers;

    public AttemptResponseDTO(Attempt attempt) {
        this.id = attempt.getId();
        this.score = attempt.getScore();
        this.initDate = attempt.getInitDate();
        this.endDate = attempt.getEndDate();
        this.user = new UserResponseDTO(attempt.getUser());
        this.userAnswers = attempt.getUserAnswers().stream().map((UserAnswer) -> new UserAnswerResponseDTO(UserAnswer)).toList();
        this.quiz = new QuizResponseDTO(attempt.getQuiz());
    }
}
