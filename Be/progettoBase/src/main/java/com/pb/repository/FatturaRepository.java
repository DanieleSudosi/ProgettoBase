package com.pb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.pb.entities.Fattura;

@Repository
public interface FatturaRepository extends JpaRepository<Fattura, Integer> {

}
