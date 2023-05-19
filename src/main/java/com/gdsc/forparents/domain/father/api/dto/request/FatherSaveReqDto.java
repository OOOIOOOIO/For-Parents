package com.gdsc.forparents.domain.father.api.dto.request;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FatherSaveReqDto {
    private Long fatherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @Builder
    public FatherSaveReqDto(Long fatherId, int qNum, String ans, boolean flag) {
        this.fatherId = fatherId;
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
    }
}
