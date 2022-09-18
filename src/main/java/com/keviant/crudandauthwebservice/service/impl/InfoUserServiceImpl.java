package com.keviant.crudandauthwebservice.service.impl;

import com.keviant.crudandauthwebservice.entity.InfoUser;
import com.keviant.crudandauthwebservice.repository.InfoUserRepository;
import com.keviant.crudandauthwebservice.service.InfoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InfoUserServiceImpl implements InfoUserService {
    @Autowired
    private InfoUserRepository repository;


    @Override
    public List<InfoUser> findAll() {
        return repository.findAll();
    }

    @Override
    public InfoUser findById(Long id) {
        Optional<InfoUser> optionalInfoUser= repository.findById(id);
        if (optionalInfoUser.isEmpty()){
            return null;
        }

        return optionalInfoUser.get();
    }
}
