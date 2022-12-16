package com.unab.adopcion.Controller;

import com.unab.adopcion.Models.Adopcion;
import com.unab.adopcion.Dao.AdopcionDao;
import com.unab.adopcion.Service.AdopcionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/adopcion")
public class AdopcionController {
    
    @Autowired
    private AdopcionDao adopcionDao;

    @Autowired
    private AdopcionService adopcionService;
    
    @PostMapping(value="/")
    public ResponseEntity<Adopcion> agregar(@RequestBody Adopcion adopcion)
        Adopcion obj = adopcionService.save(adopcion);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
    
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Adopcion> eliminar(@PathVariable String id){ 
        Adopcion obj = adopcionService.findById(id); 
        if(obj!=null) 
            adopcionService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @PutMapping(value="/") 
    public ResponseEntity<Adopcion> editar(@RequestBody Adopcion adopcion){ 
        Adopcion obj = adopcionService.findById(adopcion.getId_adopcion()); 
        if(obj!=null) {
            
            obj.setContraseña_adopcion(adopcion.getContraseña_adopcion());
            
            adopcionService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list")
    public List<Adopcion> consultarTodo(){
        return adopcionService.findByAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Adopcion consultaPorId(@PathVariable String id){ 
        return adopcionService.findById(id); 
    }

	public AdopcionDao getAdopcionDao() {
		return adopcionDao;
	}

	public void setAdopcionDao(AdopcionDao adopcionDao) {
		this.adopcionDao = adopcionDao;
	}

	public AdopcionService getAdopcionService() {
		return adopcionService;
	}

	public void setAdopcionService(AdopcionService adopcionService) {
		this.adopcionService = adopcionService;
	}
}