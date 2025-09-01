package com.project.Application.dto.resquest;

import com.project.Application.entity.Quiz;

public class QuizDTO {
    private String title;
    private String description;
    private String difficultyLevel;

    public Quiz toEntity(){
        Quiz quiz = new Quiz();
        quiz.setTitle(this.title);
        quiz.setDescription(this.description);
        quiz.setDifficultyLevel(this.difficultyLevel);
        return quiz;
    }
}
