package com.tiendaProyecto.dao;

import com.tiendaProyecto.domain.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDao extends JpaRepository <Factura,Long> {
     
}
