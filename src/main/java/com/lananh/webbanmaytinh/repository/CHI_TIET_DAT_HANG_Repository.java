package com.lananh.webbanmaytinh.repository;

import com.lananh.webbanmaytinh.model.CHI_TIET_DAT_HANG;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CHI_TIET_DAT_HANG_Repository extends JpaRepository<CHI_TIET_DAT_HANG,Integer> {
}
