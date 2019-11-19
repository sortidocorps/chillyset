package com.performance.chillyset.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="ping")
public class PingController {

    @ApiOperation(value = "Return a ping value", response = String.class)
    @GetMapping({"/v1/ping"})
    public String ping() {
        return "I am here";
    }

}
