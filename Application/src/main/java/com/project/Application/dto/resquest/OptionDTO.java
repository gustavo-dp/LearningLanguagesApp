package com.project.Application.dto.resquest;

import com.project.Application.entity.Option;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OptionDTO {
    private String answer;
    private Boolean isCorrect;
    public Option ToEntity() {
        Option option = new Option();
        option.setAnswer(answer);
        option.setCorrect(isCorrect);
        return option;
    }
}
