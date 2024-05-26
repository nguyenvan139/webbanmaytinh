package com.lananh.webbanmaytinh.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "San_Pham")
public class SAN_PHAM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SP_ID;

    private String TEN_SP;

    @ManyToOne
    @JoinColumn(name = "LOAI_ID")
    private LOAI_SP loaisp;
}