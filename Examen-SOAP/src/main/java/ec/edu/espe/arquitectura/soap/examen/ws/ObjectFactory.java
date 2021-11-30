//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:27:20 PM COT 
//


package ec.edu.espe.arquitectura.soap.examen.ws;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.espe.arquitectura.soap.examen.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.espe.arquitectura.soap.examen.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerPartidosFutbolRequest }
     * 
     */
    public ObtenerPartidosFutbolRequest createObtenerPartidosFutbolRequest() {
        return new ObtenerPartidosFutbolRequest();
    }

    /**
     * Create an instance of {@link ObtenerPartidosFutbolResponse }
     * 
     */
    public ObtenerPartidosFutbolResponse createObtenerPartidosFutbolResponse() {
        return new ObtenerPartidosFutbolResponse();
    }

    /**
     * Create an instance of {@link PartidoFutbol }
     * 
     */
    public PartidoFutbol createPartidoFutbol() {
        return new PartidoFutbol();
    }

    /**
     * Create an instance of {@link ObtenerLocalidadesPorPartidoRequest }
     * 
     */
    public ObtenerLocalidadesPorPartidoRequest createObtenerLocalidadesPorPartidoRequest() {
        return new ObtenerLocalidadesPorPartidoRequest();
    }

    /**
     * Create an instance of {@link ObtenerLocalidadesPorPartidoResponse }
     * 
     */
    public ObtenerLocalidadesPorPartidoResponse createObtenerLocalidadesPorPartidoResponse() {
        return new ObtenerLocalidadesPorPartidoResponse();
    }

    /**
     * Create an instance of {@link DecrementaDisponibilidadRequest }
     * 
     */
    public DecrementaDisponibilidadRequest createDecrementaDisponibilidadRequest() {
        return new DecrementaDisponibilidadRequest();
    }

    /**
     * Create an instance of {@link DecrementaDisponibilidadResponse }
     * 
     */
    public DecrementaDisponibilidadResponse createDecrementaDisponibilidadResponse() {
        return new DecrementaDisponibilidadResponse();
    }

    /**
     * Create an instance of {@link LocalidadPartido }
     * 
     */
    public LocalidadPartido createLocalidadPartido() {
        return new LocalidadPartido();
    }

}
