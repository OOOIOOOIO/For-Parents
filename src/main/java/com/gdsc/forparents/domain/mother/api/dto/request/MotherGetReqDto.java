package com.gdsc.forparents.domain.mother.api.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MotherGetReqDto {
    private String userCode;
}
