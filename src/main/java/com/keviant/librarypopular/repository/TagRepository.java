package com.keviant.librarypopular.repository;

import com.keviant.librarypopular.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface TagRepository extends JpaRepository<Tag,Long> {
}
