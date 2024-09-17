package com.data.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.demo.entity.FileStorage;
import com.data.demo.service.FileStorageService;

@RestController
@RequestMapping("/api/filestorage")
public class FileStorageController {

    @Autowired
    private FileStorageService fileStorageService;

    @PostMapping
    public ResponseEntity<FileStorage> createFileStorage(@RequestBody FileStorage fileStorage) {
        FileStorage savedFileStorage = fileStorageService.saveFileStorage(fileStorage);
        return new ResponseEntity<>(savedFileStorage, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity<List<FileStorage>> getAllFileStorage() {
        List<FileStorage> fileStorageList = fileStorageService.getAllFileStorage();
        return ResponseEntity.ok(fileStorageList);
    }
}
