package com.bcnd.studentback.Service;

import com.bcnd.studentback.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final Map<Long, Book> books = new HashMap<>();
    private final AtomicLong idGenerator = new AtomicLong();

    public Book create(Book book) {
        Long id = idGenerator.incrementAndGet();
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public List<Book> getAll() {
        return new ArrayList<>(books.values());
    }

    public Book getById(Long id) {
        return books.get(id);
    }

    public Book update(Long id, Book book) {
        if (!books.containsKey(id)) {
            throw new RuntimeException("Book not found");
        }
        book.setId(id);
        books.put(id, book);
        return book;
    }

    public void delete(Long id) {
        if (!books.containsKey(id)) {
            throw new RuntimeException("Book not found");
        }
        books.remove(id);
    }

    public List<Book> getByAuthor(String author) {
        return books.values()
                .stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }
}
