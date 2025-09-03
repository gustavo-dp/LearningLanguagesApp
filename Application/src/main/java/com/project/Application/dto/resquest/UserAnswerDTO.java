package com.project.Application.dto.resquest;

import com.project.Application.entity.Attempt;
import com.project.Application.entity.Option;
import com.project.Application.entity.Question;
import com.project.Application.entity.UserAnswer;

public class UserAnswerDTO {
    private Long attemptId;
    private Long questionId;
    private Long optionId;

    public UserAnswer toEntity(Attempt attempt, Question question, Option option) {
        UserAnswer ua = new UserAnswer();
        ua.setAttempt(attempt);
        ua.setQuestion(question);
        ua.setOption(option);
        return ua;
    }
}
