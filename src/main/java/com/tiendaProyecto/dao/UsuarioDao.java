/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tiendaProyecto.dao;

import com.tiendaProyecto.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author andre
 */
public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    
     Usuario findByUsername(String username);

    Usuario findByUsernameAndPassword(String username, String Password);

    Usuario findByUsernameOrCorreo(String username, String correo);

    boolean existsByUsernameOrCorreo(String username, String correo);

}
