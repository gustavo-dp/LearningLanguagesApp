package com.project.Application.dto.resquest;

import com.project.Application.entity.Attempt;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Getter
@Setter
public class AttemptDTO {

    @Positive(message = "The score has to be positive")
    private int score;
    @PastOrPresent(message ="The init date must be on past ")
    private LocalDateTime initDate;
    @FutureOrPresent(message="The end date must on present")
    private LocalDateTime endDate;

    public Attempt toEntity(){
        Attempt attempt = new Attempt();
        attempt.setScore(score);
        attempt.setInitDate(initDate);
        attempt.setEndDate(endDate);

        return attempt;
    }

}
