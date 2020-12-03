package com.challenge.service;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;

public interface PasswordService {
    ValidDto isValid(PasswordDto passwordDto);
}
