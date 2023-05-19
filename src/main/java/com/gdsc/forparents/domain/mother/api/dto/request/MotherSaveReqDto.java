package com.gdsc.forparents.domain.mother.api.dto.request;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MotherSaveReqDto {
    private int q_num;
    private String ans;
    private boolean flag;

    @Builder
    public MotherSaveReqDto(int qNum, String ans, boolean flag) {
        this.q_num = qNum;
        this.ans = ans;
        this.flag = flag;
    }
}
