package com.ews.pos.dikasa.entity.client;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblPromo")
public class PromoCode {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idPromo;

        @Column(length = 20)
        private String code;

        @Column(length = 20)
        private String discount;

        private Date expiredDate;

        @Column(length = 20)
        private Long idMerchant;

        @Column(length = 20)
        private Long idEmployee;

}
