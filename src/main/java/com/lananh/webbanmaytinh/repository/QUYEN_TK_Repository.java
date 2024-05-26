package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.QUYEN_TK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QUYEN_TK_Repository extends JpaRepository<QUYEN_TK,Integer> {
}
