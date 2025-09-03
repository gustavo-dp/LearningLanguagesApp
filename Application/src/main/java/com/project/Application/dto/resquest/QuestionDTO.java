package com.project.Application.dto.resquest;

import com.project.Application.entity.Question;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDTO {
    private String text;
    private String explanation;

    public Question toEntity(){
        Question question = new Question();
        question.setText(text);
        question.setExplanation(explanation);
        return question;
    }
}
