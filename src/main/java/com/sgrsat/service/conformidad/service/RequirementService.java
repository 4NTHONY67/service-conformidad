package com.sgrsat.service.conformidad.service;

import com.sgrsat.service.conformidad.dto.RequestReport;
import com.sgrsat.service.conformidad.model.Requirement;
import com.sgrsat.service.conformidad.model.RequirementMovement;

import java.util.List;


public interface RequirementService {

    List<Requirement> ReporteRequirements(RequestReport requestReport);
    List<RequirementMovement> HistorialMovimientos(int idRequirement);

}
