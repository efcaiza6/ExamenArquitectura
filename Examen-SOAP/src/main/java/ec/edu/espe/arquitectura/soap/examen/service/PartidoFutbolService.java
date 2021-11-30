/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.soap.examen.service;

import ec.edu.espe.arquitectura.soap.examen.dao.PartidoFutbolRepository;
import ec.edu.espe.arquitectura.soap.examen.ws.PartidoFutbol;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author Windows Boo
 */
@Service
@Slf4j
public class PartidoFutbolService {

    private final PartidoFutbolRepository partidoFutbolRepo;

    public PartidoFutbolService(PartidoFutbolRepository partidoFutbolRepo) {
        this.partidoFutbolRepo = partidoFutbolRepo;
    }

    public List<PartidoFutbol> obtenerPartidoFutbol(LocalDateTime fechaInicio) {
        fechaInicio = LocalDateTime.now();
        List<PartidoFutbol> partidos = this.partidoFutbolRepo.findByStartFechaAfter(fechaInicio);
        return partidos;

    }
    
    public PartidoFutbol obtenerPartidoPorCodigo(String codigoPartido){
        return this.obtenerPartidoPorCodigo(codigoPartido);
    }

}
