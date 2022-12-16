package com.unab.adopcion.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unab.adopcion.Dao.MascotaDao;
import com.unab.adopcion.Models.Mascota;

@Service
public class MascotaService {
    @Autowired
    private MascotaDao mascotaDao;

    @Transactional(readOnly=false)
    public Mascota save(Mascota mascota) {
        return mascotaDao.save(mascota);
    }

    @Transactional(readOnly=false)
    public void delete(String id) {
        mascotaDao.deleteById(id);
    }

    @Transactional(readOnly=true)
    public Mascota findById(String id) {
        return mascotaDao.findById(id).orElse(null);
    }

    @Transactional(readOnly=true)
    public List<Mascota> findAll() {
        return (List<Mascota>) mascotaDao.findAll();
    }
}

