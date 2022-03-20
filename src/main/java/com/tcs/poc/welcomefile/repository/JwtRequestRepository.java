package com.tcs.poc.welcomefile.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.poc.welcomefile.model.JwtRequest;

public interface JwtRequestRepository extends CrudRepository<JwtRequest, String>{

}
