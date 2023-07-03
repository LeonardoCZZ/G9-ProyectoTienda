/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyecto.service.impl;

import com.tiendaProyecto.dao.EmpleadoDao;
import com.tiendaProyecto.domain.Empleado;
import com.tiendaProyecto.service.EmpleadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author andre
 */
@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    
    @Autowired
    private EmpleadoDao empleadoDao;
    
    @Override
    @Transactional (readOnly=true)
    public List<Empleado> getEmpleados(boolean activos){
        var lista=empleadoDao.findAll();
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Empleado getEmpleado(Empleado Empleado){
        return empleadoDao.findById(Empleado.getIdEmpleado()).orElse(null);
    }
    
    @Override
    @Transactional
    public void save(Empleado Empleado){
        empleadoDao.save(Empleado);
    }
    
    @Override
    @Transactional
    public void delete(Empleado Empleado){
        empleadoDao.delete(Empleado);
    }
    
}
