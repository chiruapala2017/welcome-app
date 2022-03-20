package com.tcs.poc.welcomefile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tcs.poc.welcomefile.model.Team;

public interface TeamRepository extends CrudRepository<Team, Integer>{

	@Query("SELECT DISTINCT a FROM Team a LEFT OUTER JOIN FETCH a.players b")
	List<Team> getAllTeams();
	
}
