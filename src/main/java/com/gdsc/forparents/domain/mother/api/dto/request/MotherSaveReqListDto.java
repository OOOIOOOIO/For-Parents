package com.gdsc.forparents.domain.mother.api.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MotherSaveReqListDto {

    private List<MotherSaveReqDto> questions;
    private String userCode;

    public MotherSaveReqListDto(List<MotherSaveReqDto> questions, String userCode) {
        this.questions = questions;
        this.userCode = userCode;
    }
}
