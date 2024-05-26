package com.lananh.webbanmaytinh.model;

import jakarta.persistence.*;

@Entity
public class CHI_TIET_DAT_HANG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_CT_DH;

    @ManyToOne
    @JoinColumn(name = "ID_DAT_HANG")
    private DAT_HANG ID_DAT_HANG;

    @ManyToOne
    @JoinColumn(name = "SP_ID")
    private SAN_PHAM SP_ID;

    private int SO_LUONG;
}
