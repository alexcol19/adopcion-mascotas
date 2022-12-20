package com.unab.adopcion.Models;


import java.io.Serializable;
import java.util.Date;

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
public class AdopcionModels  implements Serializable{
    @Id
    @Column(name="id_adopcion")
    private String id_adopcion;
    @Column(name="fecha_adopcion")
    private Date fecha_adopcion;
    @Column(name="cantidad_adopcion")
    private double cantidad_adopcion;
    /**
     *
     */
    @Column(name="tipo_adopcion")
    private String tipo_adopcion;
    @Column(name="id_cliente")
    private String id_cliente; 

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Adopcion [id_adopcion=" + id_adopcion + ", fecha_adopcion=" + fecha_adopcion + ", cantidad_adopcion="
        + cantidad_adopcion + "tipo_adopcion=" + tipo_adopcion + ",id_cliente=" + id_cliente +"]";
    }
}
