package com.unab.adopcion.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.adopcion.Models.Adopcion;

@Repository
public interface AdopcionDao  extends CrudRepository<AdopcionDao, String> {

    Adopcion save(Adopcion adopcion);
    
}