/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.soap.examen.model;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Data
@Entity
@Table(name = "LOCALIDAD_PARTIDO")
public class LocalidadPartido {
    @Id
    @Column(name = "CODIGO_LOCALIDAD", nullable = false, length = 20)
    private String codigoLocalidad;
    @Column(name = "DISPONIBILIDAD", nullable = false)
    private Integer disponibilidad;
    @Column(name = "PRECIO", nullable = false, precision = 10, scale = 2)
    private BigDecimal precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "LOCALIDAD_PARTIDO")
    private List<PartidoFutbol> partidoFutbol;
}
