/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
package com.tiendaProyecto.service;

import com.tiendaProyecto.domain.Producto;
import java.util.List;

/**
 *
 * @author PC
 */
import com.tiendaProyecto.domain.Consultas;
import java.util.List;
public interface ConsultasService {
    //Se obtiene un listado de categorias en un List
    public List<Producto> getConsultas(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getColsultas(Producto producto);