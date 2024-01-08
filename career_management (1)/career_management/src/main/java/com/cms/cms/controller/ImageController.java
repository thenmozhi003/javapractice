package com.cms.cms.controller;

import java.io.IOException;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.cms.cms.model.ImageModel;
import com.cms.cms.service.ImageService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImageController {

    /*
     * @Autowired
     * private ImageRepo imageRepo;
     */

    /*
     * @GetMapping("/")
     * private String getForm() {
     * return "uploadForm";
     * }
     * 
     * @PostMapping("/upload/image")
     * public String handleUpload(@RequestParam("image") MultipartFile imageFile,
     * Model model) throws IOException {
     * // Set Image Bytes
     * ImageModel savedImage = imageRepo.save(ImageModel.builder()
     * .name(imageFile.getOriginalFilename())
     * .type(imageFile.getContentType())
     * .image(ImageUtility.compressImage(imageFile.getBytes()))
     * .build());
     * 
     * model.addAttribute("imageName", savedImage.getName());
     * 
     * return "uploadSuccess";
     * }
     * 
     * @GetMapping("/get/image/{name:.+}")
     * public String getImage(@PathVariable("name") String name, Model model) throws
     * IOException {
     * 
     * final Optional<ImageModel> dbImage = imageRepo.findByName(name);
     * 
     * if (dbImage.isPresent()) {
     * model.addAttribute("imageType", dbImage.get().getType());
     * model.addAttribute("imageData",
     * ImageUtility.decompressImage(dbImage.get().getImage()));
     * 
     * return "uploadSuccess";
     * 
     * } else {
     * return "errorTemplate";
     * }
     * }
     */

    @Autowired
    private ImageService imageService;

    // Add a Image UI
    @GetMapping("/add")
    public String addImageUI(Model model) {
        model.addAttribute("image", new ImageModel());
        return "add-image";
    }

    // Add a image API
    @PostMapping("/add")
    public String addImage(@ModelAttribute ImageModel imageModel, @RequestParam("imageFile") MultipartFile imageFile)
            throws IOException, IOException {
        imageService.addImage(imageModel, imageFile);
        return "redirect:/upload";
    }

    // Get all Images
    // @GetMapping("/get-images")
    // public String listImages(Model model) {
    //     List<ImageModel> images = imageService.getImages();
    //     model.addAttribute("images", images);
    //     return "get-images";
    // }

    // Get Image using image IdD
    @GetMapping(value = "/{id}/image")
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) {

        Optional<ImageModel> imageOp = imageService.getsImage(id);
        if (imageOp.isPresent()) {
            ImageModel image = imageOp.get();
            byte[] imageBytes = java.util.Base64.getDecoder().decode(image.getImage());
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);
            return new ResponseEntity<>(imageBytes, headers, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(new byte[0], HttpStatus.NOT_FOUND);
        }

    }

}
