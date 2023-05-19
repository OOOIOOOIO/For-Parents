package com.gdsc.forparents.domain.mother.domain.repository;

import com.gdsc.forparents.domain.mother.domain.Mother;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotherRepository extends JpaRepository<Mother, Long> {

    // self만 가져오기(0), qNum asc


    // other만 가져오기(1), qNum asc
}
