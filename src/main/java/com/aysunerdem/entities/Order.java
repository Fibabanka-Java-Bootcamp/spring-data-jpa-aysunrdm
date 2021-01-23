package com.aysunerdem.entities;
/////////

import javax.persistence.*;
import java.time.LocalDateTime;

public class Order<timestamp> {

    @Id
    @GeneratedValue
    private int id;

    private timestamp created_at;

    private int user_id;
    private double total;

    public Order(int id, timestamp created_at, int user_id, double total) {
        this.id = id;
        this.created_at = created_at;
        this.user_id = user_id;
        this.total = total;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "author_id")

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(timestamp created_at) {
        this.created_at = created_at;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", user_id=" + user_id +
                ", total=" + total +
                '}';
    }
}
