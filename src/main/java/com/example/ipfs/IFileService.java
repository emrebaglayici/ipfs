package com.example.ipfs;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
    String saveFile(MultipartFile file);
    byte[] loadFile(String hash);
}
