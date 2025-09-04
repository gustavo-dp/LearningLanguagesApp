package com.project.Application.service;

import com.project.Application.dto.response.QuizResponseDTO;
import com.project.Application.dto.resquest.QuizDTO;
import com.project.Application.entity.Quiz;
import com.project.Application.repository.QuizRepository;
import com.project.Application.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;


@Data
@Service
public class QuizService {
    private final QuizRepository quizRepository;
    // it's used to return an entity instead of a dto
    public Quiz getQuizByEntity (Long id){
        return quizRepository.findById(id).orElse(null);
    }
    public List<QuizResponseDTO> findAll (){
        return quizRepository.findAll().stream().map(QuizResponseDTO::new).toList();
    }
    public QuizResponseDTO findById(Long id){
        Quiz quiz =  quizRepository.findById(id).orElse(null);
        return new QuizResponseDTO(quiz);
    }
    public QuizResponseDTO save(QuizDTO quizDTO, Long id){
        Long quizId = id;
        Quiz quiz;
        if(quizId == null){
            quiz = quizDTO.toEntity();
        }else{
            quiz = getQuizByEntity(quizId);
            quiz.setTitle(quizDTO.getTitle());
            quiz.setDescription(quizDTO.getDescription());
            quiz.setDifficultyLevel(quizDTO.getDifficultyLevel());
        }
        return new QuizResponseDTO(quiz);
    }
    public void deleteById(Long id) {
        quizRepository.deleteById(id);
    }
}
