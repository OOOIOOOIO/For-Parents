package com.gdsc.forparents.domain.mother.domain.repository;

import com.gdsc.forparents.domain.father.api.dto.response.FatherGetResListDto;
import com.gdsc.forparents.domain.mother.api.dto.response.MotherGetResListDto;
import com.gdsc.forparents.domain.mother.domain.Mother;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MotherRepository extends JpaRepository<Mother, Long> {

    // self만 가져오기(0), qNum asc
    @Query(value = "select m.q_num, m.ans, m.flag " +
            "from Mother m " +
            "where m.user_id = :user_id and flag = :flag " +
            "order by m.q_num", nativeQuery = true)
    public List<MotherGetResListDto> findByUsersAndFlagOrderByQNum(@Param("user_id") Long user_id, @Param("flag") int flag);


    // other만 가져오기(1), qNum asc
}
