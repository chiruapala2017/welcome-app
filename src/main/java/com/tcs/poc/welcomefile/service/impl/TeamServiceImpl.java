package com.tcs.poc.welcomefile.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tcs.poc.welcomefile.model.Team;
import com.tcs.poc.welcomefile.repository.TeamRepository;
import com.tcs.poc.welcomefile.service.TeamService;

@Service
@Transactional(readOnly=true)
public class TeamServiceImpl implements TeamService{
	
	@Autowired
	private TeamRepository teamRepository; 
	
	@Override
	public List<Team> getAllTeams() {
		// TODO Auto-generated method stub
		return teamRepository.getAllTeams();
	}
	
}
