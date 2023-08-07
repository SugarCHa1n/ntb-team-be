package com.ntb.hackertonntb.domain.repository;

import com.ntb.hackertonntb.domain.entity.Gesipan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GesipanRepository extends JpaRepository<Gesipan, Long> {

    List<Gesipan> findByIdContaining(String keyword);
}
