package com.example.aminpanelproject.service;

import com.example.aminpanelproject.model.User;
import com.example.aminpanelproject.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
