/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendaProyecto.service;

import com.tiendaProyecto.domain.Producto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface ProductoService {
    //Se obtiene un listado de categorias en un List
    public List<Producto> getProductos(boolean activos);
    
    //Se obtiene un Producto, a partir del id de un producto
    public Producto getProducto(Producto producto);
    
    //Se inserta un nuevo producto si el id del producto esta vacio
    //Se actualiza un producto si el id del producto NO esta vacio
    public void save(Producto producto);
    
    //Se elimina el categoria que tiene el id pasado por parametro
    public void delete(Producto producto);
    
    //Lista de productos con precio entre orden dados por descripcion ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con JPQL
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
}
