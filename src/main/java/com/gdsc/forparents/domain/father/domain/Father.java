package com.gdsc.forparents.domain.father.domain;

import com.gdsc.forparents.domain.father.api.dto.request.FatherSaveReqDto;
import com.gdsc.forparents.domain.user.domain.Users;
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
    @Column(name = "q_num")
    private int qNum;
    private String ans;
    private int flag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    public Father(int qNum, String ans, int flag, Users users) {
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
        this.users = users;
    }

    // dto 정해지면
    public static Father createFather(FatherSaveReqDto fatherDto, Users users){
        return Father.builder()
                .qNum(fatherDto.getQ_num())
                .ans(fatherDto.getAns())
                .flag(fatherDto.getFlag())
                .users(users)
                .build();
    }
}
