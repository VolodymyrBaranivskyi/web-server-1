package com.interview.webserver1.view.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.spring.web.json.Json;


import static com.interview.webserver1.view.controllers.Response.accepted;

@Slf4j
@RestController
@RequestMapping()
@Api(
        value = "Documents",
        description = "Operations related to documents")
public class DocumentController {

    @ApiIgnore
    @ApiOperation(
            value = "Get document from callback")
    @ApiResponse(
            code = 200,
            message = "Successfully retrieved list of all clients")
    @PostMapping("/callback/document/create")
    public ResponseEntity<?> getDocument(@RequestBody Json json) {
        return accepted();
    }
}