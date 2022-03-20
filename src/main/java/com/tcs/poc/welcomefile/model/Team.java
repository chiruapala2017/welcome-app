package com.tcs.poc.welcomefile.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	
	@Id
	@Column(name="team_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teamId;
	
	@Column(name="team_name")
	private String teamName;
	
	@Column(name="board_president")
	private String boardPresident;
	
	@Column(name="odi_world_cup_won")
	private Integer odiWorldCupWon;
	
	@Column(name="t20_world_cup_won")
	private Integer t20WorldCupWon;
	
	@Column(name="coach")
	private String coach;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="team_id", referencedColumnName="team_id")
	private Set<Player> players;

	public Integer getTeamId() {
		return teamId;
	}

	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getBoardPresident() {
		return boardPresident;
	}

	public void setBoardPresident(String boardPresident) {
		this.boardPresident = boardPresident;
	}

	public Integer getOdiWorldCupWon() {
		return odiWorldCupWon;
	}

	public void setOdiWorldCupWon(Integer odiWorldCupWon) {
		this.odiWorldCupWon = odiWorldCupWon;
	}

	public Integer getT20WorldCupWon() {
		return t20WorldCupWon;
	}

	public void setT20WorldCupWon(Integer t20WorldCupWon) {
		this.t20WorldCupWon = t20WorldCupWon;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
	
}