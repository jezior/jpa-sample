package pl.am.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;

    @OneToMany
    List<Book> borrowedBooks;
}
