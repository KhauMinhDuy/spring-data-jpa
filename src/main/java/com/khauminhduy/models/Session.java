package com.khauminhduy.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "sessions")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "session_id")
	private Long sessionId;

	@Column(name = "session_name")
	private String sessionName;

	@Column(name = "session_description")
	private String sessionDescription;

	@Column(name = "session_length")
	private Integer sessionLength;

	@ManyToMany
	@JoinTable(name = "session_speakers", joinColumns = @JoinColumn(name = "session_id"), inverseJoinColumns = @JoinColumn(name = "speaker_id"))
	@JsonIgnore
	private List<Speaker> speakers;

	public Session() {
	}

	public Session(String sessionName, String sessionDescription, Integer sessionLength) {
		super();
		this.sessionName = sessionName;
		this.sessionDescription = sessionDescription;
		this.sessionLength = sessionLength;
	}

	public List<Speaker> getSpeakers() {
		return speakers;
	}

	public void setSpeakers(List<Speaker> speakers) {
		this.speakers = speakers;
	}

	public Long getSessionId() {
		return sessionId;
	}

	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}

	public String getSessionName() {
		return sessionName;
	}

	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}

	public String getSessionDescription() {
		return sessionDescription;
	}

	public void setSessionDescription(String sessionDescription) {
		this.sessionDescription = sessionDescription;
	}

	public Integer getSessionLength() {
		return sessionLength;
	}

	public void setSessionLength(Integer sessionLength) {
		this.sessionLength = sessionLength;
	}
}
