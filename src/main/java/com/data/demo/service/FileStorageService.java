package com.data.demo.service;

import java.util.List;

import com.data.demo.entity.FileStorage;

public interface FileStorageService {
    FileStorage saveFileStorage(FileStorage fileStorage);
    List<FileStorage> getAllFileStorage();
}
