package com.gdsc.forparents.domain.father.api.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FatherReqListDto {

    private List<FatherReqDto> questions;
    private String userCode;
}
