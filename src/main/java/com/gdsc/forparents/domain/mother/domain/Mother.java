package com.gdsc.forparents.domain.mother.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Mother {
    @Id
    @GeneratedValue
    @Column(name = "mother_id")
    private Long motherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @Builder
    private Mother(int qNum, String ans, boolean flag) {
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
    }

    // dto 정해지면
    public static Mother createMother(){
        return null;
    }
}
