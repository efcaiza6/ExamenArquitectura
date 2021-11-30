/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.soap.examen.dao;

import ec.edu.espe.arquitectura.soap.examen.ws.PartidoFutbol;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Windows Boo
 */
public interface PartidoFutbolRepository extends JpaRepository<PartidoFutbol, String>{
    List<PartidoFutbol> findByStartFechaAfter(LocalDateTime fechaInicio);
    PartidoFutbol findByCodigoPartido(String codigoPartido);
}
