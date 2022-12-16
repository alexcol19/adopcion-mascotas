package com.unab.adopcion.Service;

import com.unab.adopcion.Models.Admin;
import com.unab.adopcion.Dao.AdminDao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    @Transactional(readOnly=false)
    public Admin save(Admin admin) {
        return adminDao.save(admin);
    }

    @Transactional(readOnly=false)
    public void delete(String id) {
        adminDao.deleteById(id);
    }

    @Transactional(readOnly=true)
    public Admin findById(String id) {
        return ((Object) adminDao.findById(id)).orElse(null);
    }

    @Transactional(readOnly=true)
    public List<Admin> findAll() {
        return (List<Admin>) adminDao.findAll();
    }
}
