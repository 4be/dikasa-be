package com.ews.pos.dikasa.entity;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name = "tblSubs")
public class Subscription {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idSubs;

        @Column(length = 20)
        private String ididCategorySubs;

        @Column(length = 20)
        private String idCostumer;

        @Column(length = 20)
        private String ammount;

        @Column(length = 20)
        private String idReff;

        @Column(length = 20)
        private Date Expired;


}
