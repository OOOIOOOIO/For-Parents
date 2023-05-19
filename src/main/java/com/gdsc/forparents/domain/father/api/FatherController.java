package com.gdsc.forparents.domain.father.api;

import com.gdsc.forparents.domain.father.api.dto.request.FatherGetReqDto;
import com.gdsc.forparents.domain.father.api.dto.request.FatherSaveReqListDto;
import com.gdsc.forparents.domain.father.api.dto.response.FatherGetListDto;
import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResInterface;
import com.gdsc.forparents.domain.father.application.FatherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;


@Slf4j
@Controller
@RequestMapping("/api/father")
public class FatherController {

    private final FatherService fatherService;

    public FatherController(FatherService fatherService) {
        this.fatherService = fatherService;
    }

    /**
     * 아버지를 눌렀을때 -> 아버지 작성한 테스트 결과 제공
     */
    @GetMapping("/self")
    public ResponseEntity<FatherGetListDto> fatherSelf(@RequestBody FatherGetReqDto fatherGetReqDto) {

        List<FatherGetResInterface> fatherSelf = fatherService.getFatherSelf(fatherGetReqDto.getUserCode());

        return new ResponseEntity<>(new FatherGetListDto(fatherSelf), HttpStatus.OK);
    }

    /**
     * 아버지 테스트 -> 아버지에 대한 테스트 결과 완료 눌렀을 때
     */

    @PostMapping("/self")
    public ResponseEntity<String> fatherSelfResult(@RequestBody FatherSaveReqListDto fatherReqListDto) {
        fatherService.saveFatherSelf(fatherReqListDto);

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }

    /**
     * 아버지 테스트 -> 아버지가 어머니에 대한 테스트 결과 완료 눌렀을 때
     */
    @PostMapping("/other")
    private ResponseEntity<String> fatherOtherResult(@RequestBody FatherSaveReqListDto fatherReqListDto) {

        fatherService.saveFatherOther(fatherReqListDto);

        return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
    }




}
