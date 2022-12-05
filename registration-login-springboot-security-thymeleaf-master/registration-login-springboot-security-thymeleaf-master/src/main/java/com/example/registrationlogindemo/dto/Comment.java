package com.example.registrationlogindemo.dto;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private LocalDate date;

    public Comment getCommentt() {
        return commentt;
    }

    public void setCommentt(Comment commentt) {
        this.commentt = commentt;
    }

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment commentt;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Comment(String comment,Customer customer) {
        this.comment = comment;
        this.customer = customer;
        this.date = LocalDate.now();
    }

    public Comment(String comment, Comment commentt, Customer customer) {
        this.comment = comment;
        this.date = LocalDate.now();
        this.commentt = commentt;
        this.customer = customer;
    }

    public Comment() {
    }


}
