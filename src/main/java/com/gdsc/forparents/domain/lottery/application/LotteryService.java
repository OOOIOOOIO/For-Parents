package com.gdsc.forparents.domain.lottery.application;

import com.gdsc.forparents.domain.lottery.api.dto.LotterySaveReqDto;
import com.gdsc.forparents.domain.lottery.api.dto.LotteryResListDto;
import com.gdsc.forparents.domain.lottery.domain.Lottery;
import com.gdsc.forparents.domain.lottery.domain.repository.LotteryRepository;
import com.gdsc.forparents.domain.user.domain.Users;
import com.gdsc.forparents.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class LotteryService {

    private final LotteryRepository lotteryRepository;
    private final UserRepository userRepository;

    /**
     * 추첨판 저장
     */
    public void saveLottery(LotterySaveReqDto lotteryReqDto){
        String userCode = lotteryReqDto.getUserCode();
        Users user = userRepository.findByUserCode(userCode);

        for (String content : lotteryReqDto.getContents()) {
            Lottery lottery = Lottery.creatLottery(content, user);
            lotteryRepository.save(lottery);
        }

    }

    /**
     * 추첨판 조회
     */
    public LotteryResListDto getLottery(String userCode){
        Users user = userRepository.findByUserCode(userCode);
        log.info(user.getUserCode());

        List<Lottery> lotteryContents = lotteryRepository.findByUsers(user);
        ArrayList<String> contents = new ArrayList<>();

        for (Lottery lotteryContent : lotteryContents) {
            contents.add(lotteryContent.getContents());
        }

        return new LotteryResListDto(contents);

    }
}
