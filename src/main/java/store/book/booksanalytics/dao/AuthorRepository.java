package store.book.booksanalytics.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import store.book.booksanalytics.model.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findByAuthorNameContains(String name);
}
