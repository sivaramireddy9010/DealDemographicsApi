package com.Tapinnov.service;

import com.Tapinnov.entity.Deal;
import com.Tapinnov.repository.DealRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DealServiceImpl implements DealService{

    @Autowired
    private DealRepository dealRepository;

    @Override
    public Deal savedemo_i_id_detatils(Deal deal) {
        return dealRepository.save(deal);
    }

    @Override
    public List<Deal> fetchdemo_i_id_detatils() {
        List<Deal> demo_i_id_detatils = dealRepository.findAll();
        return demo_i_id_detatils;
    }

    @Override
    public Deal getDemodeatilsById(int id) {
        Optional<Deal> demodeails = dealRepository.findById(id);
        if (demodeails.isPresent()) {
            return demodeails.get();
        }
        return null;
    }

    @Override
    public Deal updateDemodeatilsById(int id, Deal deal) {
        Optional<Deal> id1 = dealRepository.findById(id);

        if (id1.isPresent()) {
        	Deal originalEmployee = id1.get();

            if (Objects.nonNull(deal.getDemoDealName()) && !"".equalsIgnoreCase(deal.getDemoDealName())) {
                originalEmployee.setDemoDealName(deal.getDemoDealName());
            }            
            return dealRepository.save(originalEmployee);
        }
        return null;
    }

    @Override
    public String deleteDemodeatilsById(int id) {
        if (dealRepository.findById(id).isPresent()) {
        	dealRepository.deleteById(id);
            return "Demo deatils deleted successfully";
        }
        return "No such Demo deatils in the database";
    }
}
