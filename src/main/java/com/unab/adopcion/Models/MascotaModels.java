package com.unab.adopcion.Models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="mascota")
public class Mascota  implements Serializable{
    @Id
    @Column(name="id_mascota")
    private String id_mascota;
    @Column(name="nombre_mascota")
    private String nombre_mascota;
    @Column(name="contraseña_mascota")
    private String contraseña_mascota;

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Cliente [id_mascota=" + id_mascota + ", nombre_mascota
                + contraseña_mascota + "]";
    }
}

