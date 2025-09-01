package com.project.Application.dto.response;

import com.project.Application.entity.Attempt;
import com.project.Application.entity.Option;
import com.project.Application.entity.Question;
import com.project.Application.entity.UserAnswer;

public class UserAnswerResponseDTO {
    private Long Id;
    private Attempt attempt;
    private Question question;
    private Option option;
    public UserAnswerResponseDTO(UserAnswer userAnswer) {
        this.Id = userAnswer.getId();
        this.attempt = userAnswer.getAttempt();
        this.question = userAnswer.getQuestion();
        this.option = userAnswer.getOption();
    }
}
