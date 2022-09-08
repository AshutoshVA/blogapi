package com.blogapp.blogappapis.services.impl;

import com.blogapp.blogappapis.services.FileService;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileServiceImpl implements FileService {
    @Override
    public String uploadImage(String path, MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public InputStream getSource(String path, String fileName) throws FileNotFoundException {
        return null;
    }
}
