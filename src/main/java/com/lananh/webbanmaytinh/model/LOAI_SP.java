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
@Table(name = "LOAI_SP")
public class LOAI_SP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int LOAI_ID;

    private String TEN_LOAI_SP;
    @Override
    public String toString() {
        return "LOAI_SP{" +
                "LOAI_ID=" + LOAI_ID +
                ", TEN_LOAI_SP='" + TEN_LOAI_SP + '\'' +
                '}';
    }
}
