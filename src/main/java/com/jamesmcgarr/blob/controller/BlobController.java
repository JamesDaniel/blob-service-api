package com.jamesmcgarr.blob.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class BlobController {

    @GetMapping(value = "api/v1/blob/{id}", produces = "application/json", consumes = "application/json")
    public String test(@PathVariable int id) {
        return "test response " + id;
    }

    @PostMapping(value = "api/v1/blob", produces = "application/json", consumes = "application/json")
    public String test(@RequestBody String request, HttpServletResponse response) {
        return request;
    }
}
