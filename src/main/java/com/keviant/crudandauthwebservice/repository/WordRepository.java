package com.keviant.crudandauthwebservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.keviant.crudandauthwebservice.entity.Word;


@CrossOrigin("*")
public interface WordRepository extends JpaRepository<Word, Long> {
}