package com.gdsc.forparents.domain.father.domain.repository;

import com.gdsc.forparents.domain.father.domain.Father;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FatherRepository extends JpaRepository<Father, Long> {

    // self만 가져오기(0), qNum asc


    // other만 가져오기(1), qNum asc



}
