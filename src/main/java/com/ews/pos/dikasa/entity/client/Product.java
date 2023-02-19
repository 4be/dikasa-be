package com.ews.pos.dikasa.entity.client;


import jdk.jfr.Enabled;

import javax.persistence.*;

@Enabled
@Table(name = "tblProduct")
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length = 20)
        private String nameProduct;

        @Column(length = 20)
        private String stock;

        @Column(length = 20)
        private String idCategory;

}
