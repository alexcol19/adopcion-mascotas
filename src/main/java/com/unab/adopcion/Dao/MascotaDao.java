package com.unab.adopcion.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.adopcion.Models.Mascota;

@Repository
public interface MascotaDao  extends CrudRepository<Mascota, String> {
    
}
