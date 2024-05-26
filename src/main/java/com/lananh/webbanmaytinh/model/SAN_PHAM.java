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
@Table(name = "SAN_PHAM")
public class SAN_PHAM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SP_ID;

    private String TEN_SP;

    @ManyToOne
    @JoinColumn(name = "LOAI_ID")
    private LOAI_SP LOAI_ID;

    private String MO_TA;
    private String GIA_CA;

    @Override
    public String toString() {
        return "SAN_PHAM{" +
                "ID : " + SP_ID +
                ", Tên : '" + TEN_SP + '\'' +
                ", Loại : '" + LOAI_ID.getTEN_LOAI_SP() + '\'' + // assuming getTen_loai_sp() is a method in LOAI_SP class
                ", Mô tả : '" + MO_TA + '\'' +
                ", Giá : '" + GIA_CA + '\'' +
                '}';
    }

}