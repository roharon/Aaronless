package com.aaronroh.api_template.webservice.api;

import com.aaronroh.api_template.domain.user.UserData;
import com.aaronroh.api_template.domain.user.UserRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
public class ApiController {
    private UserRepository userRepository;

    @ApiOperation(value="Get User's data")
    @GetMapping("/user/{id}")
    public @ResponseBody ApiResponse getUser(@ApiParam(value="User's id", required=true) @PathVariable Long id){
        UserData user = userRepository.findById(id).get();

        return ApiAdapter.apiResponse(user);
    }

    @ApiOperation(value="Create User")
    @Validated
    @PostMapping("/user")
    public @ResponseBody ApiResponse createUser(@ApiParam(value="User data", required=true) @RequestBody UserData user){
        userRepository.save(user);
        return ApiAdapter.apiResponse(user);
    }
}
