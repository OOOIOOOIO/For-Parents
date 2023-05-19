package com.gdsc.forparents.domain.father.domain.repository;

import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResListDto;
import com.gdsc.forparents.domain.father.domain.Father;
import com.gdsc.forparents.domain.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FatherRepository extends JpaRepository<Father, Long> {



    // self만 가져오기(0), qNum asc
    @Query(value = "select f.q_num, f.ans, f.flag " +
            "from father f " +
            "where f.user_id = :user_id and flag = :flag " +
            "order by f.q_num", nativeQuery = true)
    public List<FatherGetResListDto> findByUsersAndFlagOrderByQNum(@Param("user_id") Long user_id, @Param("flag") int flag);



    // other만 가져오기(1), qNum asc



}
