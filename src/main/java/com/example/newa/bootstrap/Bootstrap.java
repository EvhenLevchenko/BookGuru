package com.example.newa.bootstrap;

import com.example.newa.domain.Author;
import com.example.newa.domain.Book;
import com.example.newa.repository.AuthorRepository;
import com.example.newa.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author author = new Author("Eric", "Evans");
        Book ddd = new Book("DOmain", "1234", "Harper");
        author.getBooks().add(ddd);
        ddd.getAuthors().add(author);

        authorRepository.save(author);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Olins");
        Book jdk = new Book("Java Dev Kit", "2344", "Boston");
        rod.getBooks().add(jdk);

        authorRepository.save(rod);
        bookRepository.save(jdk);
    }
}
