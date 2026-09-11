package com.sgrsat.service.conformidad.repository;

import com.sgrsat.service.conformidad.model.Requirement;
import com.sgrsat.service.conformidad.model.RequirementMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RequirementMovementRepository extends JpaRepository<RequirementMovement, Integer>, JpaSpecificationExecutor<RequirementMovement> {


    @Query("SELECT rm FROM RequirementMovement rm WHERE rm.iCodigo_Req = :codigoReq") List<RequirementMovement> findByCodigoReq(@Param("codigoReq") Integer codigoReq);
}
