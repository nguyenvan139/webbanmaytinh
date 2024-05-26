package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.DAT_HANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DAT_HANG_Repository extends JpaRepository<DAT_HANG,Integer> {
}
