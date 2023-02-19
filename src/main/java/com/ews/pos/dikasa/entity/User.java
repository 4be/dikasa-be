package com.ews.pos.dikasa.entity;

import javax.persistence.*;

@Entity
@Table(name = "tblUser")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

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

        private Boolean isaktif;

}
