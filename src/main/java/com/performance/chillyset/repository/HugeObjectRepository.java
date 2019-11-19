package com.performance.chillyset.repository;

import com.performance.chillyset.model.HugeObject;

import org.springframework.data.repository.CrudRepository;


public interface HugeObjectRepository extends CrudRepository<HugeObject, Long> {

}
