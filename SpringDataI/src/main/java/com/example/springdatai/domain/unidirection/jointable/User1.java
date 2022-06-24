package com.webshop.mapping.domain.unidirection.jointable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user1")
@Getter @Setter
public class User1 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @OneToMany
    private List<Review1> reviews;

    @OneToOne
    private Address1 address1;

}
