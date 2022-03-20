package com.tcs.poc.welcomefile.controller;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.poc.welcomefile.model.Team;
import com.tcs.poc.welcomefile.service.TeamService;

/**
 * Created by Java Developer Zone on 19-07-2017.
 */
@RestController
public class    IndexController {
    /*@RequestMapping("/home")
    public String index() {
    	return "forward:/index.html";
    }*/
	
	@Autowired
	private TeamService teamService; 
    
    @RequestMapping("/")
    public ModelAndView login() {
    	return new ModelAndView("index");
    }
    
    @RequestMapping("/errorPage")
    public ModelAndView error() {
    	return new ModelAndView("errorPage");
    }
    
    @SuppressWarnings("unchecked")
	@GetMapping("/getSomeData")
    public ResponseEntity<JSONObject> getSomeData() {
    	JSONObject jsonObject = new JSONObject();
    	jsonObject.put("message", "success");
    	jsonObject.put("user", "Chiranjib");
    	
    	return ResponseEntity.ok(jsonObject);
    }
    
    @RequestMapping("/getAllTeam")
    @ResponseBody
    public List<Team> getAllTeam() {
    	List<Team> teams = teamService.getAllTeams();
    	return teams;
    }
}