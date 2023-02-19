package com.ews.pos.dikasa.entity.client;

import javax.persistence.*;

@Entity
@Table(name = "tblMerchant")
public class Merchant {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idMerchant;

        @Column(length = 20)
        private String name;

        @Column(length = 20)
        private String alamat;





}
