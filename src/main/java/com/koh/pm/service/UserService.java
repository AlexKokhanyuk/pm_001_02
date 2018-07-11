package com.koh.pm.service;

import com.koh.pm.model.User;

/**
 * Service class for {@link User}
 *
 * @author
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
