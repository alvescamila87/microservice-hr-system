package br.com.camila.user_api.services;

import br.com.camila.user_api.domain.User;

import java.util.List;

public interface UserService {

    User findByID(Long id);
    List<User> findAll();
}
