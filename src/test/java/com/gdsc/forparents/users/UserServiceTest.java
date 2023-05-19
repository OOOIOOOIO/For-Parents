package com.gdsc.forparents.users;

import com.gdsc.forparents.domain.user.application.UserService;
import com.gdsc.forparents.domain.user.domain.Users;
import com.gdsc.forparents.domain.user.domain.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @Test
    @Transactional
    public void userCreateAndSaveTest(){
        // given
        String userCode = userService.createUser();
        // when
        Users byUserCode = userRepository.findByUserCode(userCode);

        // then
        log.info("===="+userCode);
        log.info("===="+byUserCode.getUserCode());
    }
}
