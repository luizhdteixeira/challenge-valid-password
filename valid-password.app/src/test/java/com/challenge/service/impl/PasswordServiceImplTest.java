package com.challenge.service.impl;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;
import com.challenge.service.PasswordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

class PasswordServiceImplTest {

    @Inject
    PasswordService passwordService = new PasswordServiceImpl();

    @Test
    void isValidTruePassword() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto = new ValidDto();

        // WHEN
        passwordDto.setPassword("AbTp9!fok");
        validDto = passwordService.isValid(passwordDto);

        Assertions.assertTrue(validDto.isValid());

    }

//IsValid("") // false
//IsValid("aa") // false
//IsValid("ab") // false
//IsValid("AAAbbbCc") // false
//IsValid("AbTp9!foo") // false
//IsValid("AbTp9!foA") // false
//IsValid("AbTp9 fok") // false
//IsValid("AbTp9!fok") // true



}
