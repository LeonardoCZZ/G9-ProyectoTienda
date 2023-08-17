package com.tiendaProyecto.dao;


import com.tiendaProyecto.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}
