package com.gdsc.forparents.domain.user.domain;

import com.gdsc.forparents.domain.father.domain.Father;
import com.gdsc.forparents.domain.lottery.domain.Lottery;
import com.gdsc.forparents.domain.mother.domain.Mother;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    private String userCode;

    @OneToMany(mappedBy = "users", cascade = CascadeType.REMOVE)
    private List<Mother> mothersList = new ArrayList<>();

    @OneToMany(mappedBy = "users", cascade = CascadeType.REMOVE)
    private List<Father> fatherList = new ArrayList<>();

    @OneToOne(mappedBy = "users", cascade = CascadeType.REMOVE)
    private Lottery lottery;


    @Builder
    private Users(String userCode) {
        this.userCode = userCode;
    }

    public static Users createUser(String userCode){

        return Users.builder()
                .userCode(userCode)
                .build();

    }
}
