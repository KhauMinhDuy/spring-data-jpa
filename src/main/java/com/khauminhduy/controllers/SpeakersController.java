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

import com.khauminhduy.models.Speaker;
import com.khauminhduy.services.SpeakerService;

@RestController
@RequestMapping("/api/v1/speakers")
public class SpeakersController {

    @Autowired
    private SpeakerService speakerService;

    @GetMapping
    public List<Speaker> list(@RequestParam(required = false) String firstname,
    		@RequestParam(required = false) String lastname) {
    	if(firstname != null && lastname != null) {
    		return speakerService.findByFirstNameAndLastName(firstname, lastname);
    	}
        return speakerService.list();
    }

    @GetMapping("{id}")
    public Speaker get(@PathVariable Long id) {
        return speakerService.find(id);
    }

    @PostMapping
    public Speaker create(@RequestBody final Speaker speaker){
        return speakerService.create(speaker);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        speakerService.delete(id);
    }

    @PutMapping
    public Speaker update(@PathVariable Long id, @RequestBody Speaker speaker) {
        Speaker existingSpeaker = speakerService.find(id);
        BeanUtils.copyProperties(speaker, existingSpeaker, "session_id");
        return speakerService.update(speaker);
    }

}
