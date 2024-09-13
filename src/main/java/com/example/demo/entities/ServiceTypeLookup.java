package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "srvc_type")
public class ServiceTypeLookup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Service_Type_Identifier_Id")
	private Integer id;

	@Column(name = "Service_Type_Name")
	private String serviceTypeName;

	@Column(name = "Service_Type_Description")
	private String serviceTypeDescription;

	@Column(name = "Effective_Start_Date")
	private LocalDateTime effectiveStartDate;

	@Column(name = "Effective_End_Date")
	private LocalDateTime effectiveEndDate;

	@Column(name = "Active_Indicator")
	private String activeIndicator;
}
