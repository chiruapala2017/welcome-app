package com.tcs.poc.welcomefile;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.tcs.poc.welcomefile.model.Team;
import com.tcs.poc.welcomefile.service.TeamService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WelcomeApplicationServiceTest {
	
	@Autowired
	private TeamService teamService;
	
	@Test
	public void getAllTeams() {
		
		List<Team>  teams = teamService.getAllTeams();
		
		try 
		{
			ObjectMapper mapper = new ObjectMapper();
			mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(teams);
			System.out.println(json);
		}
		catch (JsonProcessingException e) 
		{
			e.printStackTrace();
		}
	}
	
}
