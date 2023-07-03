/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tiendaProyecto.controller;

import com.tiendaProyecto.domain.Empleado;
import com.tiendaProyecto.service.EmpleadoService;
import com.tiendaProyecto.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author andre
 */
@Controller
@Slf4j
@RequestMapping("/empleado")
public class EmpleadoController {
    
     @Autowired
    private EmpleadoService empleadoService;
    
    @GetMapping("/listado")
    public String inicio(Model model){
        var empleados = empleadoService.getEmpleados(false);
        model.addAttribute("empleados", empleados);
        model.addAttribute("totalEmpleados", empleados.size());
        return "/empleado/listado";
    }
    
    @GetMapping("/nuevo")
    public String empleadoNuevo(Empleado empleado){
        return "/empleado/modifica";
    }
    
    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;
    
    @PostMapping ("/guardar")
    public String empleadoGuardar(Empleado empleado){
        empleadoService.save(empleado);
        return "redirect:/empleado/listado";
    }
    
    @GetMapping("/eliminar/{idEmpleado}")
    public String empleadoEliminar(Empleado empleado){
        empleadoService.delete(empleado);
        return "redirect:/empleado/listado";
    }
    
    @GetMapping("/modificar/{idEmpleado}")
    public String empleadoModificar(Empleado empleado, Model model){
        empleado = empleadoService.getEmpleado(empleado);
        model.addAttribute("empleado", empleado);
        return "/empleado/modifica";
    }
    
}
