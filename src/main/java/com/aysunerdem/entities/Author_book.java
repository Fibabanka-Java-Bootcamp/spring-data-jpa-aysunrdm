package com.aysunerdem.entities;
import javax.persistence.*;

@Entity
public class Author_book {

    @Id
    @GeneratedValue
    private int author_id;
    private String book_isbn;

    public Author_book() {
        this.author_id = author_id;
        this.book_isbn = book_isbn;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")


    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    @Override
    public String toString() {
        return "Author_book{" +
                "author_id=" + author_id +
                ", book_isbn='" + book_isbn + '\'' +
                '}';
    }


}
