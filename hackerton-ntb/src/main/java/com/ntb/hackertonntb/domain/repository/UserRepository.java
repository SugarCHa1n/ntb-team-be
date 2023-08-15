package com.ntb.hackertonntb.domain.repository;

import com.ntb.hackertonntb.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByIdContaining(String keyword);
    List<User> findBySkillName(String skillname);
    List<User> findByCategoryName(String categoryname);
    List<User> findByLoginID(String loginid);
}
