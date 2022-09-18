package com.keviant.crudandauthwebservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.keviant.crudandauthwebservice.dto.WordDto;
import com.keviant.crudandauthwebservice.entity.Word;
import com.keviant.crudandauthwebservice.mapper.Mapper;
import com.keviant.crudandauthwebservice.dto.JsonDataDto;
import com.keviant.crudandauthwebservice.service.WordService;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    @Autowired
    private Mapper mapper;
    @Autowired
    private WordService wordService;

    @SneakyThrows
    @Bean
    public CommandLineRunner initDatabase() {

        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("src/main/resources/data.json");
        JsonDataDto jsonDataDto = objectMapper.readValue(file, JsonDataDto.class);

        return args -> {
            for (WordDto wordDto : jsonDataDto.getWordDtoList()) {
                Word newWord = mapper.toWord(wordDto);
                log.info("Preloading " + newWord.getValue());
                wordService.save(newWord);
            }
        };
    }
}
