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
import org.springframework.web.bind.annotation.RestController;

import com.khauminhduy.models.TicketPrice;
import com.khauminhduy.services.TicketPriceService;

@RestController
@RequestMapping("/api/v1/ticket_prices")
public class TicketPricesController {

    @Autowired
    private TicketPriceService repository;

    @GetMapping
    public List<TicketPrice> list() {
        return repository.list();
    }

    @GetMapping
    @RequestMapping("{id}")
    public TicketPrice get(@PathVariable Long id) {
        return repository.find(id);
    }

    @PostMapping
    public TicketPrice create(@RequestBody final TicketPrice tp){
        return repository.create(tp);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        repository.delete(id);
    }

    @PutMapping
    public TicketPrice update(@PathVariable Long id, @RequestBody TicketPrice tp) {
        TicketPrice existingTp = repository.find(id);
        BeanUtils.copyProperties(tp, existingTp, "ticket_price_id");
        return repository.update(tp);
    }

}
