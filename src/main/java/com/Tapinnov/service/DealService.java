package com.Tapinnov.service;

import java.util.List;

import com.Tapinnov.entity.Deal;

public interface DealService {

    Deal savedemo_i_id_detatils(Deal deal);

    List<Deal> fetchdemo_i_id_detatils();

    Deal getDemodeatilsById(int id);

    Deal updateDemodeatilsById(int id, Deal deal);

    String deleteDemodeatilsById(int id);
}
