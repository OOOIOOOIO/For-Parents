package com.gdsc.forparents.domain.mother.application;

import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResListDto;
import com.gdsc.forparents.domain.mother.api.dto.request.MotherSaveReqDto;
import com.gdsc.forparents.domain.mother.api.dto.request.MotherSaveReqListDto;
import com.gdsc.forparents.domain.mother.api.dto.response.MotherGetResListDto;
import com.gdsc.forparents.domain.mother.domain.Mother;
import com.gdsc.forparents.domain.mother.domain.repository.MotherRepository;
import com.gdsc.forparents.domain.user.domain.Users;
import com.gdsc.forparents.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class MotherService {

    private final MotherRepository motherRepository;
    private final UserRepository userRepository;

    /**
     * 엄마가 엄마거 조회(self)
     */
    public List<MotherGetResListDto> getMotherSelf(String userCode){
        Users users = userRepository.findByUserCode(userCode);
        int flag = 0;
        List<MotherGetResListDto> byUsersAndFlagOrderByQNum = motherRepository.findByUsersAndFlagOrderByQNum(users.getUserId(), flag);


        return byUsersAndFlagOrderByQNum;
    }

    /**
     * 엄마가 아빠한 거 조회(other)
     */

    /**
     * 엄마가 엄마한거 저장(self)
     */
    public void saveMotherSelf(MotherSaveReqListDto motherSaveReqListDto){

        String userCode = motherSaveReqListDto.getUserCode();
        Users users = userRepository.findByUserCode(userCode);

        for (MotherSaveReqDto question : motherSaveReqListDto.getQuestions()) {
            Mother mother = Mother.builder()
                    .ans(question.getAns())
                    .qNum(question.getQ_num())
                    .flag(question.isFlag())
                    .users(users)
                    .build();

            motherRepository.save(mother);
        }

    }

    /**
     * 엄마가 아빠한 거 저장(other)
     */
    public void saveMotherOther(){

    }

}
