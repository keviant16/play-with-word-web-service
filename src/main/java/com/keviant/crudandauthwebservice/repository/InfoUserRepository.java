package com.keviant.crudandauthwebservice.repository;

import com.keviant.crudandauthwebservice.entity.InfoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface InfoUserRepository extends JpaRepository<InfoUser, Long> {
}
