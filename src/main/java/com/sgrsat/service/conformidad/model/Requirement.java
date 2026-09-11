package com.sgrsat.service.conformidad.model;

import jakarta.persistence.*;
        import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "GRMaeRequerimiento")
@Data // agrega getters, setters y constructor sin parámetro
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iCodigo_Req")
    Integer iCodigo_Req;

    @Column(name = "sdFecha_Req", nullable = false)
    LocalDateTime sdFecha_Req;

    @Lob
    @Column(name = "vDescripcion_Req", nullable = false)
    String vDescripcion_Req;

    @Column(name = "vSumilla_Req", length = 2000)
    String vSumilla_Req;

    @Column(name = "iCodigoPadre_Req")
    Integer iCodigoPadre_Req;

    @Column(name = "iCodigo_Uo", nullable = false)
    Integer iCodigo_Uo;

    @Column(name = "iCodUo_Per")
    Integer iCodUo_Per;

    @Column(name = "iCodigo_Per", nullable = false)
    Integer iCodigo_Per;

    @Column(name = "siCodigo_Est", nullable = false)
    Short siCodigo_Est;

    @Column(name = "iCodigo_CSC")
    Integer iCodigo_CSC;

    @Column(name = "iCodigo_Pri")
    Integer iCodigo_Pri;

    @Column(name = "iCodigo_TipEva")
    Integer iCodigo_TipEva;

    @Column(name = "iCodigo_TipEnv")
    Integer iCodigo_TipEnv;

    @Column(name = "iCodigo_TipDocSus")
    Integer iCodigo_TipDocSus;

    @Column(name = "iCodigo_PriEvalDat")
    Integer iCodigo_PriEvalDat;

    @Column(name = "iCodigo_TipMod")
    Integer iCodigo_TipMod;

    @Column(name = "iCodigo_TipAut")
    Integer iCodigo_TipAut;

    @Column(name = "iCodigo_TipNoCon")
    Integer iCodigo_TipNoCon;

    @Column(name = "cNumero_DocSus", length = 60)
    String cNumero_DocSus;

    @Column(name = "sdFecha_DocSus")
    LocalDateTime sdFecha_DocSus;

    @Column(name = "vDocumentoAdjunto_Req", length = 30)
    String vDocumentoAdjunto_Req;

    @Column(name = "vObservacion_Req", length = 1000)
    String vObservacion_Req;

    @Column(name = "bAvance_Req", nullable = false)
    Boolean bAvance_Req;

    @Column(name = "bFisico_Req", nullable = false)
    Boolean bFisico_Req;

    @Column(name = "iCodPer")
    Integer iCodPer;

    @Column(name = "siCodigo_DId")
    Short siCodigo_DId;

    @Column(name = "cDocIde", length = 12)
    String cDocIde;

    @Column(name = "cNumDoc", length = 12)
    String cNumDoc;

    @Column(name = "vCodInv", length = 25)
    String vCodInv;

    @Column(name = "cCodSAF", length = 11)
    String cCodSAF;

    @Column(name = "bVigencia_Req", nullable = false)
    Boolean bVigencia_Req;

    @Column(name = "sdFechaCierre_Req")
    LocalDateTime sdFechaCierre_Req;

    @Column(name = "bMigracion_Req", nullable = false)
    Boolean bMigracion_Req;

    @Column(name = "bActivo_Req", nullable = false)
    Boolean bActivo_Req;

    @Column(name = "cCodPerActualizacion", length = 4, nullable = false)
    String cCodPerActualizacion;

    @Column(name = "sdFechaActualizacion_Req", nullable = false)
    LocalDateTime sdFechaActualizacion_Req;

  //  @Column(name = "cNombreTerminal", length = 20, nullable = false)
  //  String cNombreTerminal;
}
