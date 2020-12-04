package com.challenge.service.impl;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;
import com.challenge.service.PasswordService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

class PasswordServiceImplTest {

    @Inject
    PasswordService passwordService = new PasswordServiceImpl();

    @Test
    @DisplayName("IsValid(AbTp9!fok)")
    void isValidTruePassword() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("AbTp9!fok");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertTrue(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid()")
    void isValidFalsePasswordWith_Empty() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(aa)")
    void isValidFalsePasswordWith_aa() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("aa");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(ab)")
    void isValidFalsePasswordWith_ab() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("ab");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(AAAbbbCc)")
    void isValidFalsePasswordWith_AAAbbbCc() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("AAAbbbCc");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(AbTp9!foo)")
    void isValidFalsePasswordWith_AbTp9__foo() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("AbTp9!foo");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(AbTp9 fok)")
    void isValidFalsePasswordWith_AbTp9_fok() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("AbTp9 fok");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

    @Test
    @DisplayName("IsValid(AbTp9!foA)")
    void isValidFalsePasswordWith_AbTp9__foA() {
        // Given
        PasswordDto passwordDto = new PasswordDto();
        ValidDto validDto;

        // When
        passwordDto.setPassword("AbTp9!foA");
        validDto = passwordService.isValid(passwordDto);

        // Then
        Assertions.assertFalse(validDto.isValid());
    }

}
