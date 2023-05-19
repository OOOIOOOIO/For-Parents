package com.gdsc.forparents.api.main.application;

import com.gdsc.forparents.api.main.api.dto.MainGetListDto;
import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResInterface;
import com.gdsc.forparents.domain.father.application.FatherService;
import com.gdsc.forparents.domain.father.domain.repository.FatherRepository;
import com.gdsc.forparents.domain.mother.api.dto.response.MotherGetResInterface;
import com.gdsc.forparents.domain.mother.application.MotherService;
import com.gdsc.forparents.domain.mother.domain.repository.MotherRepository;
import com.gdsc.forparents.domain.user.application.UserService;
import com.gdsc.forparents.domain.user.domain.Users;
import com.gdsc.forparents.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainService {
    private final FatherRepository fatherRepository;
    private final MotherRepository motherRepository;
    private final UserRepository userRepository;

    public MainGetListDto getMain(String userCode){
        Users users = userRepository.findByUserCode(userCode);
        int self = 0;
        int other = 1;

        // 엄마 -> 엄마
        List<MotherGetResInterface> motherSelf = motherRepository.findByUsersAndFlagOrderByQNum(users.getUserId(), self);
        // 엄마 -> 아빠
        List<MotherGetResInterface> motherOther = motherRepository.findByUsersAndFlagOrderByQNum(users.getUserId(), other);

        // 아빠 -> 아빠
        List<FatherGetResInterface> fatherSelf= fatherRepository.findByUsersAndFlagOrderByQNum(users.getUserId(), self);
        // 아빠 -> 엄마
        List<FatherGetResInterface> fatherOther = fatherRepository.findByUsersAndFlagOrderByQNum(users.getUserId(), other);


        return new MainGetListDto(motherSelf, motherOther, fatherSelf, fatherOther);
    }
}
