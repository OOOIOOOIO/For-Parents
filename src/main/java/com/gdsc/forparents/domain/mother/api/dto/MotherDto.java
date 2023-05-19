package com.gdsc.forparents.domain.mother.api.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MotherDto {

    private Long motherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @Builder
    public MotherDto(Long motherId, int qNum, String ans, boolean flag) {
        this.motherId = motherId;
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
    }
}
