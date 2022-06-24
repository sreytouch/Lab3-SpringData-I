package com.webshop.mapping.domain.bidirection.jointable;

import com.webshop.mapping.domain.bidirection.joincolumn.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "address3")
public class Address3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String street;

    private String zip;

    private String city;

    @OneToOne
    private User3 user3;
}
