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
@Table(name = "subscription_agreement_item")
@Data
public class SubscriptionAgreementItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subsc_item_id")
    private Long subscItemId;

    @Column(name = "subsc_item_status", length = 50)
    private String subscItemStatus;

    @Column(name = "prod_type_id")
    private Long prodTypeId;
    
    @Column(name = "partner_id")
    private String partnerId;

//    @Column(name = "prod_id")
//    private Long prodId;
    
    @Column(name = "is_addon")
    private Integer isAddon;
    
    @Column(name = "is_billable")
    private Integer isBillable;

    @Column(name = "is_display")
    private Boolean isDisplay;


    @Column(name = "subsc_item_start_dt")
    private LocalDateTime subscItemStartDt;

    @Column(name = "subsc_item_end_dt")
    private LocalDateTime subscItemEndDt;

    @Column(name = "subsc_item_chg_dt")
    private LocalDateTime subscItemChgDt;
    
    @Column(name = "subsc_item_atual_start_dt")
    private LocalDateTime subscItemAtualStartDt;
    
    @Column(name = "subsc_item_atual_end_dt")
    private LocalDateTime subscItemAtualEndDt;
    
    @Column(name = "override_flag")
    private Boolean overrideFlag;

    @Column(name = "extended_data", length = 2000)
    private String extendedData;

    @ManyToOne
    @JoinColumn(name = "subsc_id")
    private SubscriptionAgreement subscriptionAgreement;
    
    @ManyToOne
    @JoinColumn(name = "prod_id")
    private Product product;
    
    @ManyToOne
    @JoinColumn(name = "bundle_offrng_id")
    private BundleOffering bundleOffering;
    
    @ManyToOne
    @JoinColumn(name = "prod_offr_id")
    private ProductOffering productOffering;
    
}
//	@PrePersist
//	public void prePersist() {
//		this.id = generateId();
//	}
//
//	private String generateId() {
//		StringBuilder sb = new StringBuilder("SBS");
//		Random random = new Random();
//		for (int i = 0; i < 5; i++) {
//			sb.append(random.nextInt(10));
//		}
//		return sb.toString();
//	}

