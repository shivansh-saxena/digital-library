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
public class Student {
    @Id
    @GeneratedValue
    Integer id;
    Integer age;
    String name;
    String country;
    String email;
    String phoneNumber;
    Date createdOn;
    Date updatedOn;
    @OneToOne
    Card card;

}
