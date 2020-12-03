package com.challenge.service.impl;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;
import com.challenge.service.PasswordService;

import javax.inject.Singleton;

@Singleton
public class PasswordServiceImpl implements PasswordService {

    private static final String REGEX = "^.*(?=.{9,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*)(+-]).*$";

    @Override
    public ValidDto isValid(PasswordDto passwordDto) {
        ValidDto isValid = new ValidDto();
        isValid.setValid(passwordDto.getPassword().matches(REGEX));
        return isValid;
    }
}
