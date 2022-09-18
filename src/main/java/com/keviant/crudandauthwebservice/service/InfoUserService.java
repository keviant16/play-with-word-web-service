package com.keviant.crudandauthwebservice.service;

import com.keviant.crudandauthwebservice.entity.InfoUser;

import java.util.List;
import java.util.Optional;

public interface InfoUserService {
    List<InfoUser> findAll();

    InfoUser findById(Long id);

}
