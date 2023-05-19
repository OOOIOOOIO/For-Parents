package com.gdsc.forparents.domain.lottery.domain.repository;

import com.gdsc.forparents.domain.lottery.domain.Lottery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LotteryRepository extends JpaRepository<Lottery, Long> {
}
