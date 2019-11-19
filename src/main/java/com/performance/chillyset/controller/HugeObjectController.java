package com.performance.chillyset.controller;


import com.performance.chillyset.model.HugeObject;
import com.performance.chillyset.model.SimpleObject;
import com.performance.chillyset.service.HugeObjectService;
import com.performance.chillyset.service.SimpleObjectService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/v1/hugeobject")
public class HugeObjectController {

    @Autowired
    private HugeObjectService hugeObjectService;

    @ApiOperation(value = "View a list of available HugeObject", response = List.class)
    @GetMapping
    public Iterable<HugeObject> getAll() {
        return hugeObjectService.getAll();
    }

    @ApiOperation(value = "Get HugeObject by id")
    @GetMapping("/{id}")
    @ResponseStatus(FOUND)
    public HugeObject getById (@PathVariable("id") Long id)
    {
        return hugeObjectService.getIt(id);
    }

}

