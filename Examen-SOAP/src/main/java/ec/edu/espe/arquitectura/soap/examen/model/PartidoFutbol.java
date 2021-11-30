/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arquitectura.soap.examen.model;

import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Windows Boo
 */
@Data
@Entity
@Table(name = "PARTIDO_FUTBOL")
public class PartidoFutbol {
    @Id
    @Column(name = "CODIGO_PARTIDO", nullable = false, length = 5)
    private String codigoPartido;
    @Column(name = "EQUIPO_LOCAL", nullable = false, length = 30)
    private String equipoLocal;
    @Column(name = "EQUIPO_VISITA", nullable = false, length = 30)
    private String equipoVisita;
    @Column(name = "FECHA", nullable = false)
    private LocalDateTime fecha;
    @Column(name = "LUGAR", nullable = false, length = 100)
    private String lugar;
    @JoinColumn(name = "CODIGO_LOCALIDAD", referencedColumnName = "CODIGO_LOCALIDAD", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private List<LocalidadPartido> localidadPartido;
}
