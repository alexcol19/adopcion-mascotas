package com.unab.adopcion.Dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unab.adopcion.Models.AdminModels;



@Repository
public interface AdminDao extends CrudRepository< Admin, String>  {
    

}