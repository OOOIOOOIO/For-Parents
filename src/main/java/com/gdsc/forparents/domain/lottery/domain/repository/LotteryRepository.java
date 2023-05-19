package com.gdsc.forparents.domain.lottery.domain.repository;

import com.gdsc.forparents.domain.lottery.domain.Lottery;
import com.gdsc.forparents.domain.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LotteryRepository extends JpaRepository<Lottery, Long> {


    public List<Lottery> findByUsers(Users users);
}
