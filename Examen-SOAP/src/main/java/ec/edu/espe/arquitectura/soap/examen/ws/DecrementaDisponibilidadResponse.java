//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:27:20 PM COT 
//


package ec.edu.espe.arquitectura.soap.examen.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partidoFutbol" type="{http://espe.edu.ec/arquitectura/soap/examen/ws}partidoFutbol"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "partidoFutbol"
})
@XmlRootElement(name = "decrementaDisponibilidadResponse")
public class DecrementaDisponibilidadResponse {

    @XmlElement(required = true)
    protected PartidoFutbol partidoFutbol;

    /**
     * Obtiene el valor de la propiedad partidoFutbol.
     * 
     * @return
     *     possible object is
     *     {@link PartidoFutbol }
     *     
     */
    public PartidoFutbol getPartidoFutbol() {
        return partidoFutbol;
    }

    /**
     * Define el valor de la propiedad partidoFutbol.
     * 
     * @param value
     *     allowed object is
     *     {@link PartidoFutbol }
     *     
     */
    public void setPartidoFutbol(PartidoFutbol value) {
        this.partidoFutbol = value;
    }

}
