package com.example.registrationlogindemo.dto;


import javax.persistence.*;

@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"login"})})
public class Customer implements Us{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String login;
    private String password;
    private String email;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer(String name, String login, String password, String email, String type) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.type = type;
    }

    public Customer() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String TypeOfAc() {
        return null;
    }

    @Override
    public void menu() {

    }

    @Override
    public String login(String login, String password) {
        return null;
    }

    @Override
    public String signUp(String login, String password) {
        return null;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
