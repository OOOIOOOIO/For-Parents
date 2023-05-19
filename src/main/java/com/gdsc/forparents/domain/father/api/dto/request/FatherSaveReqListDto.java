package com.gdsc.forparents.domain.father.api.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FatherSaveReqListDto {

    private List<FatherSaveReqDto> questions;
    private String userCode;
}
