package com.gdsc.forparents.domain.father.api.dto;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FatherReqDto {
    private Long fatherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @Builder
    public FatherReqDto(Long fatherId, int qNum, String ans, boolean flag) {
        this.fatherId = fatherId;
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
    }
}
