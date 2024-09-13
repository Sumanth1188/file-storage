package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "subscription_agreement")
@Data
public class SubscriptionAgreement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subsc_id")
    private Long subscId;

    @Column(name = "subsc_status", length = 50)
    private String subscStatus;
    
    @Column(name = "cust_id")
    private String CustId;

    @Column(name = "prod_type_id")
    private Long prodTypeId;

    @Column(name = "actt_id")
    private Long acttlId;

    @Column(name = "partner_id", length = 10)
    private String partnerId;

    @Column(name = "subsc_start_dt")
    private LocalDateTime subscStartDt;

    @Column(name = "subsc_end_dt")
    private LocalDateTime subscEndDt;

    @Column(name = "subc_chg_dt")
    private LocalDateTime actualEndDt;
    
    @Column(name = "actual_start_dt")
    private LocalDateTime ActualStartDt;

    @Column(name = "actual_end_dt")
    private LocalDateTime ActualEndDt;
    
    @Column(name = "extended_data", length = 2500)
    private String extendedData;
    
    @ManyToOne
    @JoinColumn(name = "prod_offrg_id")
    private ProductOffering productOffering;
    

}