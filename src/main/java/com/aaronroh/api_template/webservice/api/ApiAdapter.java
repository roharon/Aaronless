package com.aaronroh.api_template.webservice.api;

import com.aaronroh.api_template.domain.user.UserData;

import java.util.List;

public class ApiAdapter {

    public static ApiResponse apiResponse(final UserData user, final List<String> errors) {
        return ApiResponse.builder()
                .user(user)
                .errors(errors)
                .build();
    }

    public static ApiResponse apiResponse(final UserData user) {
        return ApiResponse.builder()
                .user(user)
                .build();
    }
}