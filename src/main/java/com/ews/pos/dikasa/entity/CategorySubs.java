package com.ews.pos.dikasa.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblCategorySubs")
public class CategorySubs {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idCategorySubs;

        @Column(length = 20)
        private String name;

        @Column(length = 20)
        private String price;

        @Column(length = 20)
        private String promoCode;

}

