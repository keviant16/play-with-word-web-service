package com.keviant.crudandauthwebservice.service.impl;

import com.keviant.crudandauthwebservice.entity.InfoUser;
import com.keviant.crudandauthwebservice.entity.Word;
import com.keviant.crudandauthwebservice.repository.WordRepository;
import com.keviant.crudandauthwebservice.service.InfoUserService;
import com.keviant.crudandauthwebservice.service.WordService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordRepository repository;
    @Autowired
    private InfoUserService infoUserService;

    @SneakyThrows
    @Override
    public String getRandomWord(Long id) {

        List<Word> words = findAll();
        Random random = new Random();
        InfoUser infoUser =  infoUserService.findById(id);
        int randomInt = random.nextInt(words.size());
        Word randomWord =  words.get(randomInt);
        boolean isIn = false;

        if(infoUser.getWords().size() == words.size()){
            infoUser.setWords(new ArrayList<>());
        }

        for (String wordStr: infoUser.getWords()) {
            if (wordStr == randomWord.getValue()) {
                isIn = true;
            }
        }

        if(isIn){
            this.getRandomWord(id);
        }

        return randomWord.getValue();
    }
    @Override
    public Word save(Word word) {
        return repository.save(word);
    }
    

    @Override
    public List<Word> findAll() {
        return repository.findAll();
    }

}
