package com.cms.cms.controller;
import java.io.IOException;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.cms.cms.model.FileModel;
import com.cms.cms.repository.FileRepo;
@Controller
public class FileController {
    @Autowired
    private FileRepo fileRepo;

    // @GetMapping("/")
    // public String listUploadedFiles(Model model) {

    //     List<FileModel> documents = fileRepo.findAll();
    //     model.addAttribute("documents", documents);
    //     return "list";
    // }

    @GetMapping("/upload")
    public String uploadForm() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) {

        try {
            FileModel document = new FileModel();
            document.setFileName(file.getOriginalFilename());
            document.setFileType(file.getContentType());
            document.setData(file.getBytes());
            fileRepo.save(document);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Success";
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadFile(@PathVariable Long id) {
        Optional<FileModel> documentOptional = fileRepo.findById(id);

        if (documentOptional.isPresent()) {
            FileModel document = documentOptional.get();
            HttpHeaders headers = new HttpHeaders();
            headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + document.getFileName());

            return new ResponseEntity<>(document.getData(), headers, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }
}
    







