package com.lananh.webbanmaytinh.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.bind.Name;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DAT_HANG")
public class DAT_HANG {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DAT_HANG_ID;
    private Date NGAY_THEM;

    @ManyToOne
    @JoinColumn(name = "TK_ID")
    private TAI_KHOAN TK_ID;

    @OneToMany(mappedBy = "ID_DAT_HANG")
    private List<CHI_TIET_DAT_HANG> CTDH;
}
