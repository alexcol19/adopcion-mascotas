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
@Table(name="admin")
public class Admin  implements Serializable{
    @Id
    @Column(name="id_admin")
    private String id_admin;
    @Column(name="nombre_admin")
    private String nombre_admin;
    @Column(name="contraseña_admin")
    private String contraseña_admin;

    @Override
    public String toString() {
        return "Admin [id_admin=" + id_admin + ", nombre_admin=" + nombre_admin + ", contraseña_admin="
                + contraseña_admin + "]";
    }
}