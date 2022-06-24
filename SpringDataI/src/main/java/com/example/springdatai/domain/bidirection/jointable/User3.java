package com.webshop.mapping.domain.bidirection.jointable;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user3")
@Getter @Setter
public class User3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @OneToMany
    private List<Review3> reviews;

    @OneToOne(mappedBy = "user3")
    private Address3 address3;

}
