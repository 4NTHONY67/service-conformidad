package com.sgrsat.service.conformidad.service;

import com.sgrsat.service.conformidad.dto.RequestReport;
import com.sgrsat.service.conformidad.model.Requirement;
import com.sgrsat.service.conformidad.model.RequirementMovement;
import com.sgrsat.service.conformidad.repository.RequirementMovementRepository;
import com.sgrsat.service.conformidad.repository.RequirementRepository;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class RequirementServiceImpl implements RequirementService {

    private final RequirementRepository requirementRepository;
    private final RequirementMovementRepository requirementMovementRepository;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public RequirementServiceImpl(RequirementRepository requirementRepository, RequirementMovementRepository requirementMovementRepository) {
        this.requirementRepository = requirementRepository;
        this.requirementMovementRepository = requirementMovementRepository;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Requirement> ReporteRequirements(RequestReport requestReport) {

        LocalDateTime fechaInicio = LocalDateTime.parse(
                requestReport.getFechaInicio(),
                FORMATTER
        );

        LocalDateTime fechaFin = LocalDateTime.parse(
                requestReport.getFechaFin(),
                FORMATTER
        );

        Specification<Requirement> specification = (root, query, criteriaBuilder) -> {

            List<jakarta.persistence.criteria.Predicate> predicates =
                    new ArrayList<>();

            // sdFecha_Req >= fechaInicio
            predicates.add(
                    criteriaBuilder.greaterThanOrEqualTo(
                            root.get("sdFecha_Req"),
                            fechaInicio
                    )
            );

            // sdFecha_Req < fechaFin
            predicates.add(
                    criteriaBuilder.lessThan(
                            root.get("sdFecha_Req"),
                            fechaFin
                    )
            );

            return criteriaBuilder.and(
                    predicates.toArray(new jakarta.persistence.criteria.Predicate[0])
            );
        };

        return requirementRepository.findAll(specification);  //se muestra error aqui
    }

    @Override
    @Transactional(readOnly = true)
    public List<RequirementMovement> HistorialMovimientos(int idRequirement) {
        return requirementMovementRepository
                .findByCodigoReq(idRequirement);
    }





}
