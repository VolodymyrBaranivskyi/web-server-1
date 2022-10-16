package com.interview.webserver1.view.controllers;

import org.springframework.http.ResponseEntity;

import static org.springframework.http.HttpStatus.*;

public class Response {

    private Response() {
    }

    public static ResponseEntity<?> ok() {
        return new ResponseEntity<>(OK);
    }

    public static ResponseEntity<?> accepted() {
        return new ResponseEntity<>(ACCEPTED);
    }


}
