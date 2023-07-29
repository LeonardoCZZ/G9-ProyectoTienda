/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyecto.service.impl;

/**
 *
 * @author Mayerling
 */
public class ConsultasServiceImpl {
    @Autowired
    private EmpleadoDao empleadoDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Producto> getProducto(boolean activos){
        var lista=ProductoDao.findAll();
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;

}
