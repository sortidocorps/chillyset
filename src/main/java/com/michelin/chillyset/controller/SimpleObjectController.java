package com.michelin.chillyset.controller;


import com.michelin.chillyset.model.SimpleObject;
import com.michelin.chillyset.service.SimpleObjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/v1/simpleobject")
public class SimpleObjectController {

    @Autowired
    private SimpleObjectService simpleObjectService;

    @ApiOperation(value = "View a list of available SimpleObject", response = List.class)
    @GetMapping
    public Iterable<SimpleObject> getAll() {
        return simpleObjectService.getAll();
    }

    @ApiOperation(value = "Get SimpleObject by id")
    @GetMapping("/{id}")
    @ResponseStatus(FOUND)
    public SimpleObject getById (@PathVariable("id") Long id) {
        return simpleObjectService.getIt(id);
    }

}

