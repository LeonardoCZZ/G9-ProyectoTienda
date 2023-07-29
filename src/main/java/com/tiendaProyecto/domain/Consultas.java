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
 * @author PC
 */
import lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "products")
public class Consultas {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    @Column
    private String name;
    @Column
    private String category;
    
@ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;

    public Consultas() {
    }

    public Consultas(long idProducto, String name, String category, LocalDateTime creationDate) {
        this.idProducto = idProducto;
        this.name = name;
        this.category = category;
        this.creationDate = creationDate;
    }
}