package com.gdsc.forparents.domain.user.application;

import com.gdsc.forparents.domain.user.domain.Users;
import com.gdsc.forparents.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    /**
     * userCode(UUID) 반환
     */
    public String createUser(){
        String userCode = UUID.randomUUID().toString().substring(0, 15);

        log.info("===== 유저생성 ==== : {}", userCode);
        Users user = Users.createUser(userCode);
        userRepository.save(user);

        return userCode;
    }


}
