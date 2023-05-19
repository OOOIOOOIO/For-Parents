package com.gdsc.forparents.api.main.api;

import com.gdsc.forparents.api.main.api.dto.MainGetListDto;
import com.gdsc.forparents.api.main.api.dto.MainGetReqDto;
import com.gdsc.forparents.api.main.application.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/parents/result")
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;

    @GetMapping("")
    public ResponseEntity<MainGetListDto> getMainResults(@RequestBody MainGetReqDto mainGetReqDto){

        MainGetListDto main = mainService.getMain(mainGetReqDto.getUserCode());

        return new ResponseEntity<>(main, HttpStatus.OK);
    }
}
