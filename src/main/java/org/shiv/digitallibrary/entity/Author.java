package org.shiv.digitallibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Author {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String email;
    Integer age;
    String country;
}
