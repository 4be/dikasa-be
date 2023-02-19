package com.ews.pos.dikasa.entity.client;

import javax.persistence.*;

@Entity
@Table(name = "tblCategory")
public class Category {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idCategory;

        @Column(length = 20)
        private String cateogryName;





}
