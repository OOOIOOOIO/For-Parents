package com.gdsc.forparents.domain.father.application;

import com.gdsc.forparents.domain.father.domain.Father;
import com.gdsc.forparents.domain.father.domain.repository.FatherRepository;
import com.gdsc.forparents.domain.user.domain.Users;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class FatherService {

    private final FatherRepository fatherRepository;
    private final Father father;

    public String fatherTestResult() {
        Users user = father.getUsers();

        return user.getUserCode();
    }

}
