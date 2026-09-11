package com.sgrsat.service.conformidad.repository;

import com.sgrsat.service.conformidad.model.Requirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RequirementRepository extends JpaRepository<Requirement, Integer>, JpaSpecificationExecutor<Requirement> {
}
