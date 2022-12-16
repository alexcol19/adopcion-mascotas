package com.unab.adopcion.Controller;

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

import com.unab.adopcion.Dao.MascotaDao;
import com.unab.adopcion.Models.Mascota;
import com.unab.adopcion.Service.MascotaService;

@RestController
@CrossOrigin("*")
@RequestMapping("/mascota")
public class MascotaController {
    @Autowired
    private MascotaDao mascotaDao; 
    public MascotaDao getMascotaDao() {
        return mascotaDao;
    }

    public void setMascotaDao(MascotaDao mascotaDao) {
        this.mascotaDao = mascotaDao;
    }

    @Autowired
    private MascotaService mascotaService;
    
    @PostMapping(value="/")
    public ResponseEntity<Mascota> agregar(@RequestBody Mascota mascota){        
        Mascota obj = mascotaService.save(mascota);
        return new ResponseEntity<>(obj, HttpStatus.OK);     
    }
   
    @DeleteMapping(value="/{id}") 
    public ResponseEntity<Mascota> eliminar(@PathVariable String id){ 
        Mascota obj = mascotaService.findById(id); 
        if(obj!=null) 
            mascotaService.delete(id); 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @PutMapping(value="/") 
    public ResponseEntity<Mascota> editar(@RequestBody Mascota mascota){ 
        Mascota obj = mascotaService.findById(mascota.getId_mascota()); 
        if(obj!=null) { 
            obj.setNombre_mascota(mascota.getNombre_mascota());
            obj.setId_mascota(mascota.getId_mascota());
            mascotaService.save(obj); 
        } 
        else 
            return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR); 
        return new ResponseEntity<>(obj, HttpStatus.OK); 
    }
    
    @GetMapping("/list") 
    public List<Mascota> consultarTodo(){
        return mascotaService.findAll(); 
    }
    
    @GetMapping("/list/{id}") 
    public Mascota consultaPorId(@PathVariable String id){ 
        return mascotaService.findById(id); 
    }
    
}
