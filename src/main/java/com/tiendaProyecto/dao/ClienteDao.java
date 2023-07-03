/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendaProyecto.dao;

import com.tiendaProyecto.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author andre
 */

public interface ClienteDao extends JpaRepository <Cliente,Long> {
    
}
