package com.gdsc.forparents.domain.lottery.api.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LotterySaveReqDto {
    private List<String> contents;
    private String userCode;

    @Builder
    public LotterySaveReqDto(List<String> contents, String userCode) {
        this.contents = contents;
        this.userCode = userCode;
    }


}
