/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyecto.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author andre
 */
@Data
@Entity
@Table(name="empleado")
public class Empleado implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Long idEmpleado;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int cedula;
    private String correo;
    private int telefono;
    private String contrasena;
    private String direccion;
    @Column(name = "tipo")
    private String tipoEmpleado;
    private boolean activo;

    public Empleado() {
    }

    public Empleado(String empleado, boolean activo) {
        this.nombre = empleado;
        this.activo = activo;
    }


}
