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
@Table(name = "TAI_KHOAN")
public class TAI_KHOAN {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TK_ID;
    private String TEN_TK;
    private String MAT_KHAU;
    private String Email;

    @ManyToOne
    @JoinColumn(name = "QUYEN_ID")
    private QUYEN_TK QUYEN_ID;

}
