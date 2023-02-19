package com.ews.pos.dikasa.entity.client;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblKas")
public class Kas {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idKas;

        @Column(length = 20)
        private String saldo;

        @Column(length = 20)
        private String idEmployee;

        private Date tanggal;


}
