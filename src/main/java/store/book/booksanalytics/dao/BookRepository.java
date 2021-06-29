package store.book.booksanalytics.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import store.book.booksanalytics.model.Book;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByAuthorId(Long id);
}
