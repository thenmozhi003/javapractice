package com.cms.cms.model;

import java.util.Arrays;
import jakarta.persistence.*;

@Entity
@Table(name = "files")
public class FileModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    private String fileType; // "pdf" or "docx"

    @Lob
    @Column(name = "file", columnDefinition = "LONGBLOB")
    private byte[] data;

    @Override
    public String toString() {
        return "FileDocument [id=" + id + ", fileName=" + fileName + ", fileType=" + fileType + ", data="
                + Arrays.toString(data) + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}







