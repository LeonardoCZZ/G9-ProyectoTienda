/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendaProyecto.service;

import com.tiendaProyecto.domain.Cliente;
import java.util.List;

/**
 *
 * @author andre
 */
public interface ClienteService {
    
     //Se obtiene un listado de categorias en un List
    public List<Cliente> getClientes(boolean activos);
    
    //Se obtiene un Categoria, a partir del id de un categoria
    public Cliente getCliente(Cliente cliente);
    
    //Se inserta un nuevo categoria si el id del categoria esta vacio
    //Se actualiza un categoria si el id del categoria NO esta vacio
    public void save(Cliente cliente);
    
    //Se elimina el categoria que tiene el id pasado por parametro
    public void delete(Cliente cliente);
    
}
