package com.data.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data.demo.entity.FileStorage;

public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {
}