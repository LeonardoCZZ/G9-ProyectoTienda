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
@Table(name="cliente")
public class Cliente implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")    
    private Long idCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int cedula;
    private String correo;
    private int telefono;
    private String contrasena;
    private String direccion;
    private boolean activo;

    public Cliente() {
    }

    public Cliente(String cliente, boolean activo) {
        this.nombre = cliente;
        this.activo = activo;
    }

}
