package com.performance.chillyset.service;

import com.performance.chillyset.controller.error.BeeNotFoundException;
import com.performance.chillyset.model.HugeObject;
import com.performance.chillyset.repository.HugeObjectRepository;

import org.springframework.stereotype.Service;

/**
* Service used to manage {@Link Jumpsuit}s
*/
@Service
public class HugeObjectService {

    private final HugeObjectRepository hugeObjectRepository;

    public HugeObjectService(HugeObjectRepository hugeObjectRepository) {
        this.hugeObjectRepository = hugeObjectRepository;
    }

    public Iterable<HugeObject> getAll() {
        return hugeObjectRepository.findAll();
    }

    public HugeObject getIt(Long id) {
        HugeObject huge = hugeObjectRepository.findById(id).orElseThrow(() ->  new BeeNotFoundException());
        return huge;
    }

    public HugeObject create (HugeObject newHives) {

        return hugeObjectRepository.save(newHives);
    }

}
