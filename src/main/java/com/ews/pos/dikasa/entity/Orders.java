package com.ews.pos.dikasa.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblOrder")
public class Orders {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 20)
        private String idCostumer;

        @Column(length = 20)
        private String paymentType;

        @Column(length = 20)
        private String idCategorySubs;

        @Column(length = 20)
        private Boolean isPaid;


}
