package org.shiv.digitallibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Book {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    @OneToOne
    Author author;
    Integer numberOfPages;
    String language;
    Boolean available;
    String genre;
    String isbnNumber;
    Date publishedDate;
}
