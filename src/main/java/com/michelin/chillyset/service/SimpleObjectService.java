package com.michelin.chillyset.service;

import com.michelin.chillyset.controller.error.BeeNotFoundException;
import com.michelin.chillyset.model.SimpleObject;
import com.michelin.chillyset.repository.SimpleObjectRepository;

import org.springframework.stereotype.Service;

/**
* Service used to manage {@Link Jumpsuit}s
*/
@Service
public class SimpleObjectService {

    private final SimpleObjectRepository simpleObjectRepository;

    public SimpleObjectService(SimpleObjectRepository simpleObjectRepository) {
        this.simpleObjectRepository = simpleObjectRepository;
    }

    public Iterable<SimpleObject> getAll() {
        return simpleObjectRepository.findAll();
    }

    public SimpleObject getIt(Long id) {
        SimpleObject simple = simpleObjectRepository.findById(id).orElseThrow(() ->  new BeeNotFoundException());
        return simple;
    }

}
