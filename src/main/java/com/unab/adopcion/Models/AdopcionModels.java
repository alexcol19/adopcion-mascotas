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
@Table(name="adopcion")
public class Adopcion  implements Serializable{
    @Id
    @Column(name="id_adopcion")
    private String id_adopcion;
    @Column(name="nombre_adopcion")
    private String nombre_adopcion;
    @Column(name="contraseña_adopcion")
    private String contraseña_adopcion;

    @Override
    public String toString() {
        return "Adopcion [id_adopcion=" + id_adopcion + ", nombre_adopcion=" + nombre_adopcion + ", contraseña_cliente="
                + contraseña_adopcion + "]";
    }
}
