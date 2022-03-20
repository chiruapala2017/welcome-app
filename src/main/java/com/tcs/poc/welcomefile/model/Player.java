package com.tcs.poc.welcomefile.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "player")
public class Player implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	
	@Id
	@Column(name="player_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer playerId;
	
	@Column(name="player_name")
	private String playerName;
	
	@Column(name="role")
	private String role;
	
	@Column(name="is_captain")
	private String isCaptain;
	
	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getIsCaptain() {
		return isCaptain;
	}

	public void setIsCaptain(String isCaptain) {
		this.isCaptain = isCaptain;
	}
}