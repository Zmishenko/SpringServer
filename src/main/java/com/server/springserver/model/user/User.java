package com.server.springserver.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "role")
    private String role;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;

    @Column(name = "surname")
    private String surname;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "fathers_name")
    private String fathers_name;

    @Column(name = "userGroup")
    private String userGroup;

    @Column(name = "departament")
    private String departament;

    @Column(name = "eventsID")
    private String eventsID;

    @Column(name = "isAuthorized")
    private boolean isAuthorized;
}
