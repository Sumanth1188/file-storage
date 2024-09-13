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
@Table(name = "language_lkp")
@Data
public class LanguageLkp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lang_id")
    private Long langId;

    @Column(name = "lang_name", length = 50)
    private String langName;

    @Column(name = "lang_value", length = 10)
    private String langValue;

    @Column(name = "created_dt")
    private LocalDateTime createdDt;
}
