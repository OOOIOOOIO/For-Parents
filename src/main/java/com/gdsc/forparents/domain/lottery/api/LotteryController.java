package com.gdsc.forparents.domain.lottery.api;

import com.gdsc.forparents.domain.lottery.api.dto.LotteryGetReqDto;
import com.gdsc.forparents.domain.lottery.api.dto.LotterySaveReqDto;
import com.gdsc.forparents.domain.lottery.api.dto.LotteryResListDto;
import com.gdsc.forparents.domain.lottery.application.LotteryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class LotteryController {

    private final LotteryService lotteryService;

    /**
     * 조회
     */
    @GetMapping("/lottery")
    public ResponseEntity<LotteryResListDto> getLottery(@RequestBody LotteryGetReqDto lotteryGetReqDto) {

        LotteryResListDto lottery = lotteryService.getLottery(lotteryGetReqDto.getUserCode());

        return new ResponseEntity<>(lottery, HttpStatus.OK);
    }

    /**
     * 저장
     */
    @PostMapping("/lottery")
    public ResponseEntity<String> saveLottery(@RequestBody LotterySaveReqDto lotteryReqDto) {

        for(String contents  : lotteryReqDto.getContents()) {
            log.info("====" + contents);

        }
        log.info(lotteryReqDto.getUserCode());
        lotteryService.saveLottery(lotteryReqDto);

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }
}
