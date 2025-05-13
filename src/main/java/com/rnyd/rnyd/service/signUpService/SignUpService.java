package com.rnyd.rnyd.service.signUpService;

import com.rnyd.rnyd.mapper.user.UserMapper;
import com.rnyd.rnyd.dto.user.UserDTO;
import com.rnyd.rnyd.model.UserEntity;
import com.rnyd.rnyd.repository.user.UserRepository;
import com.rnyd.rnyd.service.signInService.SignInService;
import com.rnyd.rnyd.service.use_case.SignUpUseCase;
import com.rnyd.rnyd.utils.constants.Plans;
import com.rnyd.rnyd.utils.security.PasswordCripter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class SignUpService implements SignUpUseCase {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordCripter passwordCripter;
    private final SignInService signInService;


    public SignUpService(UserRepository userRepository, UserMapper userMapper, PasswordCripter passwordCripter, SignInService signInService) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
        this.passwordCripter = passwordCripter;
        this.signInService = signInService;
    }

    @Override
    public List<UserDTO> getRegisteredUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .toList();
    }

    @Override
    public String register(UserDTO userSignUpRequest) {
        Optional<UserEntity> userEntityOptional = userRepository.findByEmail(userSignUpRequest.getEmail());


        if(userEntityOptional.isPresent()){
            return null;
        }

        userSignUpRequest.setKeyword(passwordCripter.hashPassword(userSignUpRequest.getKeyword()));

        UserEntity userEntity =  userRepository.save(userMapper.toEntity(userSignUpRequest));


        return signInService.registerSignIn(userEntity);
    }
}
