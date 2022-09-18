package com.keviant.crudandauthwebservice.service;


import com.keviant.crudandauthwebservice.entity.Word;

import java.util.List;

public interface WordService {
    String getRandomWord(Long id);
    Word save(Word word);
    List<Word> findAll();
}
