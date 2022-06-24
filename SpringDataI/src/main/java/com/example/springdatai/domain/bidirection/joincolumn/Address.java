package com.webshop.mapping.domain.bidirection.joincolumn;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator",  sequenceName = "address_id_seq",allocationSize = 1)
    private Long id;

    private String street;

    private String zip;

    private String city;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
}
