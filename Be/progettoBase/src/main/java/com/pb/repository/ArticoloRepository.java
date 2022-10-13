package com.pb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pb.entities.Articolo;


@Repository
public interface ArticoloRepository extends JpaRepository<Articolo, Integer> {

}
