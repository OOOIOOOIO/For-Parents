package com.gdsc.forparents.domain.user.domain.repository;

import com.gdsc.forparents.domain.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {

    public Users findByUserCode(String userCode);
}
