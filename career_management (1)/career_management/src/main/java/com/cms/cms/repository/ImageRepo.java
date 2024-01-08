package com.cms.cms.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.cms.model.ImageModel;



public interface ImageRepo extends JpaRepository<ImageModel, Long> {
    Optional<ImageModel> findByName(String name);
    Optional<ImageModel> findById(Long id);

}

