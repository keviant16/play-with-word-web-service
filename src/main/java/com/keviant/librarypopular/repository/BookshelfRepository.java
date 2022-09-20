package com.keviant.librarypopular.repository;


import com.keviant.librarypopular.entity.Bookshelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin
public interface BookshelfRepository extends JpaRepository<Bookshelf,Long> {
}
