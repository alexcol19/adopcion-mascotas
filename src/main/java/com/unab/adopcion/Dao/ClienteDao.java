package com.unab.adopcion.Dao;
import org.springframework.data.repository.CrudRepository;

import com.unab.adopcion.Models.Cliente;



public interface ClienteDao extends CrudRepository< Cliente, String>  {
    

}

