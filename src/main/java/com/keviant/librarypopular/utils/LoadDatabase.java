package com.keviant.librarypopular.utils;

import com.keviant.librarypopular.entity.Book;
import com.keviant.librarypopular.entity.Bookshelf;
import com.keviant.librarypopular.entity.Tag;
import com.keviant.librarypopular.repository.BookRepository;
import com.keviant.librarypopular.repository.BookshelfRepository;
import com.keviant.librarypopular.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@Component
public class LoadDatabase implements CommandLineRunner {

    @Autowired
    private BookshelfRepository bookshelfRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        Book book = new Book();
        Bookshelf bookshelf1 = new Bookshelf();
        book.setBookshelf(bookshelf1);
        bookRepository.save(book);

        Tag[] tags = {
                new Tag(null,"Cuisine"),
                new Tag(null,"Langue étrangère"),
                new Tag(null,"Maison, jardin et bricolage")
        };

        Bookshelf[] bookshelves = {
                new Bookshelf(null,"Jeunese"),
                new Bookshelf(null,"Histoire"),
                new Bookshelf(null,"Roman"),
                new Bookshelf(null,"Loisire"),
        };

        Arrays.stream(tags).toList().forEach(tag -> tagRepository.save(tag));
        Arrays.stream(bookshelves).toList().forEach(section -> bookshelfRepository.save(section));
    }
}
