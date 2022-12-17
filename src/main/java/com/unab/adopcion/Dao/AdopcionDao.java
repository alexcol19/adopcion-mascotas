package com.unab.adopcion.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.adopcion.Models.AdopcionModels;

@Repository
public interface AdopcionDao  extends CrudRepository<AdopcionDao, String> {

    AdopcionDao save(AdopcionDao adopcion);
    
}