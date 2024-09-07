package com.dailycodework.dream_shops.model;

import java.sql.Blob;

public class Image {
    private Long id;
    private String filename;
    private String filetype;
    private Blob image;
    private String downloadUrl;

    private Product product;
}
