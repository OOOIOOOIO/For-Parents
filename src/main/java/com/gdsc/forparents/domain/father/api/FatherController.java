package com.gdsc.forparents.domain.father.api;

import com.gdsc.forparents.domain.father.api.dto.FatherReqDto;
import com.gdsc.forparents.domain.father.api.dto.FatherReqListDto;
import com.gdsc.forparents.domain.father.application.FatherService;
import com.gdsc.forparents.domain.father.domain.Father;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("/api")
public class FatherController {

    private final FatherService fatherService;

    public FatherController(FatherService fatherService) {
        this.fatherService = fatherService;
    }

    // 아버지를 눌렀을때 -> 아버지 작성한 테스트 결과 제공
    @GetMapping("/father/self")
    public ResponseEntity<String> fatherSelf() {

        String userCode = fatherService.fatherTestResult();

        return new ResponseEntity<>(userCode, HttpStatus.OK);
    }

    // 아버지 테스트 -> 아버지에 대한 테스트 결과 완료 눌렀을 때
    @PostMapping("/father/self")
    public ResponseEntity<String> fatherSelfResult(@RequestBody FatherReqListDto fatherReqListDto) {

        List<FatherReqDto> questions = fatherReqListDto.getQuestions();
        for (FatherReqDto question : questions) {
            log.info("====="+question.getAns());
        }
        String userCode = fatherReqListDto.getUserCode();
        log.info("====="+userCode);
        return null;
//        return new ResponseEntity<>();
    }

    // 아버지 테스트 -> 아버지가 어머니에 대한 테스트 결과 완료 눌렀을 때
    @PostMapping("/father/other")
    private ResponseEntity<String> fatherOtherResult() {

        return new ResponseEntity<>();
    }


}
