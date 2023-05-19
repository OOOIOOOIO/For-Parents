package com.gdsc.forparents.domain.father.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Father {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "father_id")
    private Long fatherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @Builder
    public Father(int qNum, String ans, boolean flag) {
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
    }

    // dto 정해지면
    private static Father createFather(){

        return null;
    }
}
