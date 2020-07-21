package com.aaronroh.api_template.webservice.api;

import com.aaronroh.api_template.domain.user.UserData;
import com.aaronroh.api_template.webservice.Response;
import lombok.Builder;

import java.util.List;

public class ApiResponse extends Response<Object> {

    @Builder
    public ApiResponse(final UserData user, final List<String> errors) {
        super(user);
        this.setErrors(errors);
    }
}
