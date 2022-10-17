package com.interview.webserver1.view.controllers;

import com.interview.webserver1.logic.services.DocumentService;
import com.interview.webserver1.view.dto.CreateCallbackDto;
import com.interview.webserver1.view.dto.mappers.CreateCallbackMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;


import static com.interview.webserver1.view.controllers.Response.accepted;

@Slf4j
@RestController
@RequestMapping()
@Api(
        value = "Documents",
        description = "Operations related to documents")
public class DocumentController {

    private final DocumentService service;
    private final CreateCallbackMapper mapper;


    @Autowired
    public DocumentController(DocumentService service, CreateCallbackMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @ApiIgnore
    @ApiOperation(
            value = "Get document from callback")
    @ApiResponse(
            code = 200,
            message = "Successfully retrieved list of all clients")
    @PostMapping("/callback/document/create")
    public ResponseEntity<?> getDocument(@RequestBody CreateCallbackDto createCallbackDto) {

        log.info("Response from callback {} ", createCallbackDto);
        service.saveCallback(mapper.toEntity(createCallbackDto));

        return accepted();
    }
}
