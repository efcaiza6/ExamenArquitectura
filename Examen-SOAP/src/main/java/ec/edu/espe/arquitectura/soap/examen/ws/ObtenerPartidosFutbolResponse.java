//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.29 a las 08:27:20 PM COT 
//


package ec.edu.espe.arquitectura.soap.examen.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="partidoFutbol" type="{http://espe.edu.ec/arquitectura/soap/examen/ws}partidoFutbol" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlRootElement(name = "obtenerPartidosFutbolResponse")
public class ObtenerPartidosFutbolResponse {

    protected List<PartidoFutbol> partidoFutbol;

    /**
     * Gets the value of the partidoFutbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partidoFutbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartidoFutbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartidoFutbol }
     * 
     * 
     */
    public List<PartidoFutbol> getPartidoFutbol() {
        if (partidoFutbol == null) {
            partidoFutbol = new ArrayList<PartidoFutbol>();
        }
        return this.partidoFutbol;
    }

}
