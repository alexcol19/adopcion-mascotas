package com.unab.adopcion.Service;

import com.unab.adopcion.Models.Adopcion;
import com.unab.adopcion.Dao.AdopcionDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdopcionService {
    @Autowired
    private AdopcionDao adopcionDao;

    public AdopcionDao getAdopcionDao() {
        return adopcionDao;
    }

    public void setAdopcionDao(AdopcionDao adopcionDao) {
        this.adopcionDao = adopcionDao;
    }

    @Transactional(readOnly=false)
    public Adopcion save(Adopcion adopcion) {
        return adopcionDao.save(adopcion);
    }

    @Transactional(readOnly=false)
    public void delete(String id) {
        adopcionDao.deleteById(id);
    }

    
    @Transactional(readOnly=true)
    public Adopcion findById(String id) {
        return (Adopcion) adopcionDao.findById(id).orElse(null);
    }

    @Transactional(readOnly=true)
    public List<Adopcion> findAll() {
        return (List<Adopcion>) adopcionDao.findAll();
    }

    public List<Adopcion> findByAll() {
        return null;
    }
}
