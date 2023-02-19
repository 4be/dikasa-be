package com.ews.pos.dikasa.entity.client;


import javax.persistence.*;

@Entity
@Table(name = "tblEmployee")
public class Employee {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEmployee;

        @Column(length = 20)
        private String noktp;

        @Column(length = 100)
        private String nama;

        @Column(length = 20)
        private String dept;

        @Column(length = 100)
        private String alamat;

        @Column(length = 20)
        private String tanggalLahir;

        @Column(length = 100)
        private String email;

        @Column(length = 20)
        private String username;

        @Column(length = 100)
        private String password;

        @Column(length = 100)
        private String reff;

        @Column(length = 20)
        private String idMerchant;

        private Boolean isaktif;
}
