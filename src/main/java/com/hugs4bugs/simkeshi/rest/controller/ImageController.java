package com.hugs4bugs.simkeshi.rest.controller;

import com.hugs4bugs.simkeshi.service.classes.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ImageController {

    private final ImageServiceImpl service;

    @Autowired
    public ImageController(ImageServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/image")
    public Map<String, List<? extends Object>> sendImage(@RequestParam("image") MultipartFile file) {
        int name = Integer.parseInt(file.getName().split(".")[0]);
        return service.findTheOptimumSolution(name);
    }
}
