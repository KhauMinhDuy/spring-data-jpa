package com.khauminhduy.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khauminhduy.models.Session;
import com.khauminhduy.services.SessionService;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionsController {

	@Autowired
	private SessionService sessionService;

	@GetMapping
	public List<Session> list(@RequestParam(required = false) String name) {
		if (name != null) {
			return sessionService.getSessionContaines(name);
		} else {
			return sessionService.list();
		}
	}

	@GetMapping("{id}")
	public Session get(@PathVariable Long id) {
		return sessionService.find(id);
	}

	@PostMapping
	public Session create(@RequestBody final Session session) {
		return sessionService.create(session);
	}

	@DeleteMapping
	public void delete(@PathVariable Long id) {
		sessionService.delete(id);
	}

	@PutMapping
	public Session update(@PathVariable Long id, @RequestBody Session session) {
		Session existingSession = sessionService.find(id);
		BeanUtils.copyProperties(session, existingSession, "session_id");
		return sessionService.update(session);
	}

}
