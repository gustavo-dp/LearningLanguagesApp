package com.project.Application.service;

import com.project.Application.dto.response.UserResponseDTO;
import com.project.Application.dto.resquest.UserDTO;
import com.project.Application.entity.User;
import com.project.Application.repository.UserRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class UserService {
    private final UserRepository userRepository;
    // it's used to return an entity instead of a dto
    public User getUserByIdEntity(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserResponseDTO> findAll(){
        return userRepository.findAll().stream().map(UserResponseDTO::new).toList();
    }
    public UserResponseDTO findById(Long id){
        User user = userRepository.findById(id).orElseThrow();
        return new UserResponseDTO(user);
    }
    // update or save new user
    public UserResponseDTO save(UserDTO userDTO, Long id){
        Long userId = id;
        User user;
        // check if is an update or save a new user
        if(userId == null){
            user = userDTO.toEntity();
        }else{
            user = getUserByIdEntity(userId);
            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setRole(userDTO.getRole());
            user.setLevel(userDTO.getLevel());
            user.setXp(userDTO.getXp());

        }
        return new UserResponseDTO(userRepository.save(user));
    }
    public void deleteById(Long id){
        User user = getUserByIdEntity(id);
        userRepository.delete(user);
    }

}
