package com.keviant.crudandauthwebservice.mapper;


import com.keviant.crudandauthwebservice.dto.WordDto;
import com.keviant.crudandauthwebservice.entity.Word;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public Word toWord(WordDto wordDto){
        return new Word(null, wordDto.getValue());
    }
}
