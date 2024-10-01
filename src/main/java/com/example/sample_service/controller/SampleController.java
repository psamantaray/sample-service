package com.example.sample_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping("/greetings")
    public String getCall(){
        return "Hello Namaste!";
    }

    @PostMapping("/send")
    public ResponseEntity<Object> postMessage(@RequestBody Object request){
        return new ResponseEntity<>(request, HttpStatus.OK);
    }
}
