package com.romulomotta.bookstoremanager.repository;

import com.romulomotta.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
