package org.shiv.digitallibrary.entity;

import jakarta.persistence.*;
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
public class Transaction {
    @Id
    @GeneratedValue
    Integer id;
    @ManyToOne
    Card card;
    @ManyToOne
    Book book;
    Date transactionDate;
    Date bookDueDate;
    Boolean isIssued;
    Boolean isReturned;
    Double fineAmount;
    Boolean status;
    Date createdOn;
    Date updatedOn;

}
