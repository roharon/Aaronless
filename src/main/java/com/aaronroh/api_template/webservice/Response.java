package com.aaronroh.api_template.webservice;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public abstract class Response<T> {
    @NonNull
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer size;

    private List<String> errors;
}