package com.cursojava.curso.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "users")
@ToString @EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="Id")
    private int id;

    @Getter @Setter @Column(name="Firstname")
    private String firstName;

    @Getter @Setter @Column(name="Lastname")
    private String lastName;

    @Getter @Setter @Column(name="Password")
    private String password;

    @Getter @Setter @Column(name="Email")
    private String email;

    @Getter @Setter @Column(name="Phone")
    private String phone;


}
