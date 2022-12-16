package com.unab.adopcion.Dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.adopcion.Models.Cliente;



@Repository
public interface ClienteDao extends CrudRepository< Cliente, String>  {
    

}

