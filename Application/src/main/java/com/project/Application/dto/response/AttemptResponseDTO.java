package com.project.Application.dto.response;

import com.project.Application.entity.Attempt;
import com.project.Application.entity.Quiz;
import com.project.Application.entity.User;
import com.project.Application.entity.UserAnswer;

import java.time.LocalDateTime;
import java.util.List;

public class AttemptResponseDTO {

    private Long id;
    private Quiz quiz;
    private User user;
    private List<UserAnswer> userAnswers;
    private int score;
    private LocalDateTime initDate;
    private LocalDateTime endDate;

    public AttemptResponseDTO(Attempt attempt) {
        this.id = attempt.getId();
        this.quiz = attempt.getQuiz();
        this.user = attempt.getUser();
        this.userAnswers = attempt.getUserAnswers();
        this.score = attempt.getScore();
        this.initDate = attempt.getInitDate();
        this.endDate = attempt.getEndDate();
    }
}
