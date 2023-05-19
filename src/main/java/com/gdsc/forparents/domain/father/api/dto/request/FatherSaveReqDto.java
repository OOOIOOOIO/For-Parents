package com.gdsc.forparents.domain.father.api.dto.request;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class FatherSaveReqDto {
    private int q_num;
    private String ans;
    private int flag;

    public FatherSaveReqDto(int qNum, String ans, int flag) {
        this.q_num = qNum;
        this.ans = ans;
        this.flag = flag;
    }
}
