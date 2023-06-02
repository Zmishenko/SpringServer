package com.server.springserver.model.user;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
//@JsonIgnoreProperties(value = {"handler", "hibernateLazyInitializer", "FieldHandler"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String role;

    @Column(name = "login", unique = true)
    private String login;

    @Column(name = "password", unique = true)
    private String password;

    @Column(name = "mail", unique = true)
    private String mail;

    @Column(name = "FIO", unique = true)
    private String FIO;

    @Column(name = "userGroup")
    private String userGroup;

    @Column(name = "departament")
    private String departament;

    @Column(name = "eventsID")
    private String eventsID;

    private boolean isAuthorized;

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public String getFIO() {
        return FIO;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public String getDepartament() {
        return departament;
    }

    public String getEventsID() {
        return eventsID;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
