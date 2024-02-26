package com.Tapinnov.controller;

import com.Tapinnov.entity.Deal;
import com.Tapinnov.service.DealService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DealController {

    @Autowired
    private DealService dealService;

    @PostMapping("/demo_i_id_detatils")
    public Deal savedemo_i_id_detatils(@RequestBody Deal deal) {
        return dealService.savedemo_i_id_detatils(deal);
    }

    @GetMapping("/demo_i_id_detatils")
    public List<Deal> getAlldemo_i_id_detatils() {
        return dealService.fetchdemo_i_id_detatils();
    }

    @GetMapping("/demo_i_id_detatils/{id}")
    public Deal getDemodeatilsById(@PathVariable("id") int id) {
        return dealService.getDemodeatilsById(id);
    }

    @PutMapping("/demo_i_id_detatils/{id}")
    public Deal updateDemodeatilsById(@PathVariable("id") int id, @RequestBody Deal deal) {
        return dealService.updateDemodeatilsById(id, deal);
    }

    @DeleteMapping("/demo_i_id_detatils/{id}")
    public String deleteDemodeatilsById(@PathVariable("id") int id) {
        return dealService.deleteDemodeatilsById(id);
    }
}
