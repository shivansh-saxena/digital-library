package org.shiv.digitallibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
public class Card {
    @Id
    @GeneratedValue
    Integer id;
    Boolean status;
    String email;
    Date validUpto;
    Date createdOn;
    Date updatedOn;
}
