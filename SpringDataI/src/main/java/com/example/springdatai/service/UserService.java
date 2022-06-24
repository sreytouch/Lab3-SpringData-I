package com.webshop.mapping.service;

import com.webshop.mapping.domain.bidirection.joincolumn.User;
import com.webshop.mapping.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> findAll();

    UserDto findById(Long id);

    UserDto save(UserDto user);

    void remove(Long id);

}
