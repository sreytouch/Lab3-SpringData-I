package com.webshop.mapping.repository;

import com.webshop.mapping.domain.bidirection.joincolumn.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
