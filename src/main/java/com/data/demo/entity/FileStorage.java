package com.data.demo.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "file_storage")
public class FileStorage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "topic", nullable = false)
    private String topic;

    @Column(name = "`partition`")
    private Integer partition;

    @Column(name = "offset")
    private Long offset;

    @Column(name = "timestamp")
    private Instant timestamp;

    @Column(name = "device_sid")
    private String deviceSid;

    @Column(name = "device_sn")
    private String deviceSn;

    @Column(name = "file_class")
    private String fileClass;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_size")
    private Long fileSize;

    @Column(name = "file_url")
    private String fileUrl;

    @Column(name = "file_uuid")
    private String fileUuid;

    @Column(name = "product_class")
    private String productClass;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "upload_date")
    private Instant uploadDate;
}
