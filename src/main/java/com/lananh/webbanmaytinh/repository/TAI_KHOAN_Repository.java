package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.TAI_KHOAN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TAI_KHOAN_Repository extends JpaRepository<TAI_KHOAN,Integer> {
}
