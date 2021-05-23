package com.hugs4bugs.simkeshi.rest.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class ImageController {

    @PostMapping("/image")
    public String sendImage(@RequestParam("image") MultipartFile file) {
        return null;
    }
}
