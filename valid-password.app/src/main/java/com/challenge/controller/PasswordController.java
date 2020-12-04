package com.challenge.controller;

import com.challenge.dto.PasswordDto;
import com.challenge.dto.ValidDto;
import com.challenge.service.PasswordService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/password")
public class PasswordController {

    private final PasswordService passwordService;

    public PasswordController(PasswordService passwordService) {
        this.passwordService = passwordService;
    }

    @Post(produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
    public HttpResponse<ValidDto> validPassword(@Body PasswordDto passwordDto) {
        return HttpResponse.ok(passwordService.isValid(passwordDto));
    }
}
