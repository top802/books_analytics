package store.book.booksanalytics.model;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String bookName;

    @Column
    private Long publishedAmount;

    @Column
    private Long soldAmount;

    @ManyToOne
    @JoinColumn
    private Author author;






}
