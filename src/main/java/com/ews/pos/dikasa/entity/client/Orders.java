package com.ews.pos.dikasa.entity.client;

import javax.persistence.*;

@Entity
@Table(name = "tblOrder")
public class Orders {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idOrder;

        @Column(length = 20)
        private String noTransaksi;

        @Column(length = 20)
        private String items;

        @Column(length = 20)
        private String total;

        @Column(length = 20)
        private String kembalian;

        @Column(length = 20)
        private String sisa;

        private Boolean isDonasi;

        @Column(length = 20)
        private String idEmployee;

}
