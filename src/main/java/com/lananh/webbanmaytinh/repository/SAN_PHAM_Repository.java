package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.SAN_PHAM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SAN_PHAM_Repository extends JpaRepository<SAN_PHAM,Integer> {
}


