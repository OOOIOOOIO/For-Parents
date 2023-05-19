package com.gdsc.forparents.domain.mother.domain;

import com.gdsc.forparents.domain.mother.api.dto.request.MotherSaveReqDto;
import com.gdsc.forparents.domain.user.domain.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mother_id")
    private Long motherId;
    private int qNum;
    private String ans;
    private boolean flag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    private Mother(int qNum, String ans, boolean flag, Users users) {
        this.qNum = qNum;
        this.ans = ans;
        this.flag = flag;
        this.users = users;
    }

    // dto 정해지면
    public static Mother createMother(MotherSaveReqDto motherDto, Users users) {
        return Mother.builder()
                .qNum(motherDto.getQ_num())
                .ans(motherDto.getAns())
                .flag(motherDto.isFlag())
                .users(users)
                .build();
    }
}
