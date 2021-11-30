/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.soap.examen.endpoint;

import ec.edu.espe.arquitectura.soap.examen.service.PartidoFutbolService;
import ec.edu.espe.arquitectura.soap.examen.ws.ObtenerLocalidadesPorPartidoRequest;
import ec.edu.espe.arquitectura.soap.examen.ws.ObtenerLocalidadesPorPartidoResponse;
import ec.edu.espe.arquitectura.soap.examen.ws.ObtenerPartidosFutbolRequest;
import ec.edu.espe.arquitectura.soap.examen.ws.ObtenerPartidosFutbolResponse;
import ec.edu.espe.arquitectura.soap.examen.ws.PartidoFutbol;
import java.time.LocalDateTime;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author Windows Boo
 */
@Endpoint
@Slf4j
public class PartidoFutbolEndPoint {
    
    private static final String NAMESPACE_URI = "http://espe.edu.ec/arquitectura/soap/examen/ws";
    private final PartidoFutbolService service;

    public PartidoFutbolEndPoint(PartidoFutbolService service) {
        this.service = service;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerPartidosFutbolRequest")
    @ResponsePayload
    public ObtenerPartidosFutbolResponse obtenerPartidosFutbol(@RequestPayload ObtenerPartidosFutbolRequest request){
        List<PartidoFutbol> partidos = this.service.obtenerPartidoFutbol(LocalDateTime.now());
        ObtenerPartidosFutbolResponse response = new ObtenerPartidosFutbolResponse();
        response.getPartidoFutbol().addAll(partidos);
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "obtenerLocalidadesPorPartidoRequest")
    @ResponsePayload
    public ObtenerLocalidadesPorPartidoResponse obtenerPartidosFutbol(@RequestPayload ObtenerLocalidadesPorPartidoRequest request){
        PartidoFutbol partido = this.service.obtenerPartidoPorCodigo(request.getCodigoPartido());
        ObtenerLocalidadesPorPartidoResponse response = new ObtenerLocalidadesPorPartidoResponse();
        response.setPartidoFutbol(partido);
        return response;
    }
     
}
