package com.cms.cms.service;



import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cms.cms.model.ImageModel;
import com.cms.cms.repository.ImageRepo;

import java.io.IOException;
import java.util.*;


@Service
public class ImageService {

    private final ImageRepo imageRepo;

    private ImageService(ImageRepo imageRepo) {
        this.imageRepo = imageRepo;
    }

    public List<ImageModel> getImages() {
        return imageRepo.findAll();
    }

    public ImageModel addImage(ImageModel imageModel, MultipartFile imageFile) throws IOException {
        imageModel.setImage(Base64.getEncoder().encodeToString(imageFile.getBytes()));
        return imageRepo.save(imageModel);
    }

    public Optional<ImageModel> getsImage(Long id) {
        return imageRepo.findById(id);
    }

}

