package com.aysunerdem.entities;
///
import javax.persistence.*;

@Entity
public class Book<timestamp> {

    @Id
    @GeneratedValue
    private String isbn;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

    private String description;
    private timestamp publishedDate;
    private timestamp addedDate;
    private double price;
    private String currency;
    private String imageUrl;
    private int category_id;

    public Book() {
        this.isbn = isbn;
        this.name = name;
        this.category = category;
        this.description = description;
        this.publishedDate = publishedDate;
        this.addedDate = addedDate;
        this.price = price;
        this.currency = currency;
        this.imageUrl = imageUrl;
        this.category_id = category_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public timestamp getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(timestamp publishedDate) {
        this.publishedDate = publishedDate;
    }

    public timestamp getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(timestamp addedDate) {
        this.addedDate = addedDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", description='" + description + '\'' +
                ", publishedDate=" + publishedDate +
                ", addedDate=" + addedDate +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", category_id=" + category_id +
                '}';
    }
}
