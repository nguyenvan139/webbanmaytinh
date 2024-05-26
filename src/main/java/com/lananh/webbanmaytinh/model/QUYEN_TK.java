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
@Table(name = "QUYEN_TK")
public class QUYEN_TK {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int QUYEN_ID;
    private String TEN_QUYEN;
}
