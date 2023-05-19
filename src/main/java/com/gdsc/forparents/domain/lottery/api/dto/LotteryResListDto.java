package com.gdsc.forparents.domain.lottery.api.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LotteryResListDto {

    private List<String> contents;

    @JsonCreator
    public LotteryResListDto(List<String> contents) {
        this.contents = contents;
    }
}
