package com.example.demo.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
@Table(name = "product_extra_details")
@Data
public class ProductExtraDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_extra_dtls_id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Product product;


	@Column(name = "field_name")
	private Date fieldName;

	@Column(name = "field_val")
	private LocalDateTime fieldVal;

	@Column(name = "created_dt")
	private LocalDateTime createdDt;

}
