package com.webshop.mapping.domain.unidirection.joincolumn;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user2")
public class User2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Review2> reviews;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Address2 address;

}
