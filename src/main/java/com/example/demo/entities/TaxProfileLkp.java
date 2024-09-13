package com.example.demo.entities;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tax_profile_lkp")
@Data
public class TaxProfileLkp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tax_profile_id")
    private Long taxProfileId;

    @Column(name = "user_id", length=2000)
    private String userId;
    
    @Column(name = "tax_id")
    private Integer taxId;

    @Column(name = "eff_start_date")
    private LocalDateTime effStartDate;
    
    @Column(name = "eff_end_date")
    private LocalDateTime effEndDate;
    
    @ManyToMany
	@JoinTable(name = "tax_profile", joinColumns = @JoinColumn(name = "tax_id"), inverseJoinColumns = @JoinColumn(name = "tax_profile_id"))
	private List<TaxDtlLkp> taxDtlLkp;

   
}

