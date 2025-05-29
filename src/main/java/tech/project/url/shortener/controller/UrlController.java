package tech.project.url.shortener.controller;

import org.springframework.web.bind.annotation.RestController;

import tech.project.url.shortener.controller.dto.ShortenUrlRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UrlController {

    @PostMapping(value = "/shorten-url")
    public ResponseEntity<Void> shortenUrl(@RequestBody ShortenUrlRequest request) {
        
        return ResponseEntity.ok().build();
    }
    
}
