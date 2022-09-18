package com.keviant.crudandauthwebservice.controller;

import com.keviant.crudandauthwebservice.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping(value = "words/random")
    public ResponseEntity<?> getRandomWord(@RequestParam Long id){
        return ResponseEntity.status(HttpStatus.OK).body(wordService.getRandomWord(id));
    }
}