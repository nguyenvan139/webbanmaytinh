package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.LOAI_SP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LOAI_SP_Repository extends JpaRepository<LOAI_SP,Integer> {
}
