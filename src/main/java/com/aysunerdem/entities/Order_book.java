package com.aysunerdem.entities;

import javax.persistence.*;

/////
public class Order_book {

    @Id
    @GeneratedValue
    private int order_id;

    private String book_isbn;

    public Order_book(int order_id, String book_isbn) {
        this.order_id = order_id;
        this.book_isbn = book_isbn;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "author_id")


    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }


    @Override
    public String toString() {
        return "Order_book{" +
                "order_id=" + order_id +
                ", book_isbn='" + book_isbn + '\'' +
                '}';
    }
}
