package com.challenge.service.impl;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;
import com.challenge.service.PasswordService;

import javax.inject.Singleton;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

@Singleton
public class PasswordServiceImpl implements PasswordService {

    private static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[-!@#$%^&*()+]){9,}.*$";

    @Override
    public ValidDto isValid(PasswordDto passwordDto) {
        ValidDto validDto = new ValidDto();
        boolean isValid;
        if (Objects.isNull(passwordDto) || charVerifyRepeat(passwordDto.getPassword())) {
            isValid = false;
        } else {
            isValid = passwordDto.getPassword().matches(REGEX);
        }
        validDto.setValid(isValid);
        return validDto;
    }

    private boolean charVerifyRepeat(String chars) {
        boolean verify;
        Map<String, Integer> map = new TreeMap<>();
        for (char item: chars.toCharArray()) {
            Integer s = map.get(String.valueOf(item));
            if (s != null) {
                map.put(String.valueOf(item), ++s);
                for (Map.Entry<String, Integer> filter : map.entrySet()) {
                    verify = filter.getValue() > 1;
                    if (verify) {
                        return true;
                    }
                }
            } else {
                map.put(String.valueOf(item), 1);
            }
        }
        return false;
    }
}
