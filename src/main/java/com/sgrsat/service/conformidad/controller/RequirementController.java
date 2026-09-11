package com.sgrsat.service.conformidad.controller;

import com.sgrsat.service.conformidad.dto.RequestReport;
import com.sgrsat.service.conformidad.model.Requirement;
import com.sgrsat.service.conformidad.model.RequirementMovement;
import com.sgrsat.service.conformidad.service.RequirementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/requirements")
@CrossOrigin("*")
public class RequirementController {

    private final RequirementService requirementService;


    public RequirementController(RequirementService requirementService) {
        this.requirementService = requirementService;
    }

    @GetMapping("/reporte")
    public List<Requirement> reporte(@RequestBody RequestReport requestReport) {
        return requirementService.ReporteRequirements(requestReport);
    }

    @GetMapping("/historialMovimientos/{id}")
    public List<RequirementMovement> historialMovimientos(@PathVariable int id) {
        return requirementService.HistorialMovimientos(id);
    }

}
