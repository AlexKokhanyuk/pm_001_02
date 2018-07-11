package com.koh.pm.service;

/**
 * Service for Security.
 *
 * @author
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
