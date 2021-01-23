package com.aysunerdem.entities;
/////
import javax.persistence.*;


@Entity
public class Author {

        @Id
        @GeneratedValue
        private int id;
        private String name;

    public Author() {
        this.id = id;
        this.name = name;
    }

    @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "id", referencedColumnName = "author_id")

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    }




