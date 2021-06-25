package store.book.booksanalytics.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String authorName;

    @Column
    private LocalDate birthDate;

    @Column
    private String phone;

    @Column
    private String email;


}
