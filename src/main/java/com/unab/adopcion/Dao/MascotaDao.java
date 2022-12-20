package com.unab.adopcion.Dao;

import org.springframework.data.repository.CrudRepository;

import com.unab.adopcion.Models.Mascota;

public interface MascotaDao  extends CrudRepository<MascotaDao, String> {

    Mascota save(Mascota mascota);
    
}
