package com.sgrsat.service.conformidad.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "GRMovRequerimiento")
@Data
public class RequirementMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iCodigo_ReqMov")
    private Integer iCodigo_ReqMov;

    @Column(name = "iCodigo_Req", nullable = false)
    private Integer iCodigo_Req;

    @Column(name = "sdFecha_ReqMov", nullable = false)
    private LocalDateTime sdFecha_ReqMov;

    @Column(name = "siCodigo_Est", nullable = false)
    private Short siCodigo_Est;

    @Column(name = "iCodigo_PerOri_ReqMov")
    private Integer iCodigo_PerOri_ReqMov;

    @Column(name = "iCodUoOri_ReqMov")
    private Integer iCodUoOri_ReqMov;

    @Column(name = "iCodigo_PerDes_ReqMov")
    private Integer iCodigo_PerDes_ReqMov;

    @Column(name = "iCodUoDes_ReqMov")
    private Integer iCodUoDes_ReqMov;

    @Column(name = "bResPrincipal_ReqMov")
    private Boolean bResPrincipal_ReqMov;

    @Column(name = "bVigencia_ReqMov", nullable = false)
    private Boolean bVigencia_ReqMov;

    @Column(name = "bInformeTecnico_ReqMov")
    private Boolean bInformeTecnico_ReqMov;

    @Column(name = "vObservacion_ReqMov", length = 2000, nullable = false)
    private String vObservacion_ReqMov;

    @Column(name = "bMigracion_ReqMov", nullable = false)
    private Boolean bMigracion_ReqMov;

    @Column(name = "bActivo_ReqMov", nullable = false)
    private Boolean bActivo_ReqMov;

    @Column(name = "cCodPerActualizacion", length = 4, nullable = false)
    private String cCodPerActualizacion;

    @Column(name = "sdFechaActualizacion_ReqMov", nullable = false)
    private LocalDateTime sdFechaActualizacion_ReqMov;

    @Column(name = "cNombreTerminal_ReqMov", length = 20, nullable = false)
    private String cNombreTerminal_ReqMov;
}

