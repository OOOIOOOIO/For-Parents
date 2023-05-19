package com.gdsc.forparents.domain.father.application;

import com.gdsc.forparents.domain.father.api.dto.request.FatherSaveReqDto;
import com.gdsc.forparents.domain.father.api.dto.request.FatherSaveReqListDto;
import com.gdsc.forparents.domain.father.domain.Father;
import com.gdsc.forparents.domain.father.domain.repository.FatherRepository;
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
public class FatherService {

    private final FatherRepository fatherRepository;
    private final UserRepository userRepository;

    /**
     * 아빠가 아빠거 조회(self)
     */
    public FatherSaveReqListDto getFatherSelf(String userCode){
        Users users = userRepository.findByUserCode(userCode);

//        List<Father> byUsersAndFlagOrderByQNum = fatherRepository.findByUsersAndFlagOrderByQNum(users, false);


        return null;
    }

    /**
     * 아빠가 엄마한 거 조회(other)
     */

    /**
     * 아빠가 아빠한거 저장(self)
     */
    public void saveFatherSelf(FatherSaveReqListDto fatherSaveReqListDto){

        String userCode = fatherSaveReqListDto.getUserCode();
        Users users = userRepository.findByUserCode(userCode);

        for (FatherSaveReqDto question : fatherSaveReqListDto.getQuestions()) {
            Father father = Father.builder()
                    .ans(question.getAns())
                    .qNum(question.getQNum())
                    .flag(question.isFlag())
                    .users(users)
                    .build();

            fatherRepository.save(father);
        }

    }

    /**
     * 아빠가 엄마한 거 저장(other)
     */
    public void saveFatherOther(FatherSaveReqListDto fatherSaveReqListDto){

        String userCode = fatherSaveReqListDto.getUserCode();

        Users users = userRepository.findByUserCode(userCode);

        for (FatherSaveReqDto question : fatherSaveReqListDto.getQuestions()) {
            Father father = Father.builder()
                    .ans(question.getAns())
                    .qNum(question.getQNum())
                    .flag(question.isFlag())
                    .users(users)
                    .build();

            fatherRepository.save(father);
        }
    }


}
