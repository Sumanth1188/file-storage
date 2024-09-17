package com.data.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.demo.entity.FileStorage;
import com.data.demo.repository.FileStorageRepository;
import com.data.demo.service.FileStorageService;

@Service
public class FileStorageServiceImpl implements FileStorageService {

    @Autowired
    private FileStorageRepository fileStorageRepository;

    @Override
    public FileStorage saveFileStorage(FileStorage fileStorage) {
        return fileStorageRepository.save(fileStorage);
    }

    @Override
    public List<FileStorage> getAllFileStorage() {
        return fileStorageRepository.findAll();
    }
}
