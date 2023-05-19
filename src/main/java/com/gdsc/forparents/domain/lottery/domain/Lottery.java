package com.gdsc.forparents.domain.lottery.domain;

import com.gdsc.forparents.domain.user.domain.Users;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Lottery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lottery_id")
    private Long lotteryId;

    private String contents;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users users;

    @Builder
    private Lottery(Long lotteryId, String contents, Users users) {
        this.lotteryId = lotteryId;
        this.contents = contents;
        this.users = users;
    }

    public static Lottery creatLottery(String contents, Users users){
        return Lottery.builder()
                .contents(contents)
                .users(users)
                .build();
    }

}
