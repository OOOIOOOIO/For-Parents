package com.gdsc.forparents.domain.father.domain.repository;

import com.gdsc.forparents.domain.father.domain.Father;
import com.gdsc.forparents.domain.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FatherRepository extends JpaRepository<Father, Long> {

//    public List<Father> findByUsersAndFlagOrderByQNum(Users users, boolean flag);

    // self만 가져오기(0), qNum asc


    // other만 가져오기(1), qNum asc



}
