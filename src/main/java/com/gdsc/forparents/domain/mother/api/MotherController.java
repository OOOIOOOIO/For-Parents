package com.gdsc.forparents.domain.mother.api;

import com.gdsc.forparents.domain.mother.api.dto.request.MotherSaveReqListDto;
import com.gdsc.forparents.domain.mother.api.dto.request.MotherGetReqDto;
import com.gdsc.forparents.domain.mother.api.dto.response.MotherGetResListDto;
import com.gdsc.forparents.domain.mother.application.MotherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/api/mother")
public class MotherController {

    private final MotherService motherService;

    public MotherController(MotherService motherService) {
        this.motherService = motherService;
    }

    /**
     * 어머니를 눌렀을때 -> 어머니 작성한 테스트 결과 제공
     */
    @GetMapping("/self")
    public ResponseEntity<Map<String, List<MotherGetResListDto>>> motherSelf(@RequestBody MotherGetReqDto motherGetReqDto) {

        List<MotherGetResListDto> motherSelf = motherService.getMotherSelf(motherGetReqDto.getUserCode());
        Map<String, List<MotherGetResListDto>> questions = new HashMap<>();

        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    /**
     * 어머니 테스트 -> 어머니에 대한 테스트 결과 완료 눌렀을 때
     */

    @PostMapping("/self")
    public ResponseEntity<String> motherSelfResult(@RequestBody MotherSaveReqListDto motherReqListDto) {

        motherService.saveMotherSelf(motherReqListDto);
        return null;
//        return new ResponseEntity<>();
    }

    /**
     * 어머니 테스트 -> 어머니가 아버지에 대한 테스트 결과 완료 눌렀을 때
     */
    @PostMapping("/other")
    private ResponseEntity<String> motherOtherResult() {
        return null;
//        return new ResponseEntity<>();
    }
}
