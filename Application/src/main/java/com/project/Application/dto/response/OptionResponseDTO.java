package com.project.Application.dto.response;

import com.project.Application.entity.Option;

import java.util.List;

public class OptionResponseDTO {
    private Long id;
    private QuestionResponseDTO question;
    private List<UserAnswerResponseDTO> userAnswers;
    private String answer;
    private Boolean isCorrect;
    public OptionResponseDTO(Option option){
        this.id = option.getId();
        this.question = New QuestionResponseDTO(option.getQuestion());
        this.userAnswers = option.getUserAnswers()
                .stream()
                .map(userAnswer -> new UserAnswerResponseDTO(userAnswer))
                .toList();
        this.answer = option.getAnswer();
        this.isCorrect = option.isCorrect();

    }
}