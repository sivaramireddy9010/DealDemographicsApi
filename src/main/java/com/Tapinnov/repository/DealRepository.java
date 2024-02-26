package com.Tapinnov.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Tapinnov.entity.Deal;


@Repository
public interface DealRepository extends JpaRepository<Deal, Integer> {

}
