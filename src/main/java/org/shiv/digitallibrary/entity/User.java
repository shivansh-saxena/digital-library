package org.shiv.digitallibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "user-data")
public class User {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String userName;
    String email;
    String password;
    String Authority;
}
