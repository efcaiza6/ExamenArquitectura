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
 *         &lt;element name="codigoPartido" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codigoLocalidad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "codigoPartido",
    "codigoLocalidad"
})
@XmlRootElement(name = "decrementaDisponibilidadRequest")
public class DecrementaDisponibilidadRequest {

    @XmlElement(required = true)
    protected String codigoPartido;
    @XmlElement(required = true)
    protected String codigoLocalidad;

    /**
     * Obtiene el valor de la propiedad codigoPartido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPartido() {
        return codigoPartido;
    }

    /**
     * Define el valor de la propiedad codigoPartido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPartido(String value) {
        this.codigoPartido = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoLocalidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocalidad() {
        return codigoLocalidad;
    }

    /**
     * Define el valor de la propiedad codigoLocalidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocalidad(String value) {
        this.codigoLocalidad = value;
    }

}
