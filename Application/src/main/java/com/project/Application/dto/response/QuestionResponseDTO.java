package com.project.Application.dto.response;

import com.project.Application.dto.resquest.UserAnswerDTO;
import com.project.Application.entity.Question;

import java.util.List;
import java.util.stream.Collectors;

public class QuestionResponseDTO {
    private Long id;
    private QuizResponseDTO quiz;
    private List<OptionResponseDTO> options;
    private List<UserAnswerResponseDTO> userAnswers;
    private String text;
    private String explanation;

    public QuestionResponseDTO(Question question) {
        this.id = question.getId();
        this.quiz = new QuizResponseDTO(question.getQuiz());
        this.options = question.getOptions().stream().map(OptionResponseDTO::new).toList();
        this.userAnswers = question.getUserAnswers().stream().map(UserAnswerResponseDTO::new).toList();
        this.text = question.getText();
        this.explanation = question.getExplanation();
    }
}
