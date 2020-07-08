package pl.am.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String title;

    @ManyToOne
    User borrower;
}
