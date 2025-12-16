package org.example.Repository;

import org.example.model.Domain.MaintenanceRecord;
import org.example.model.enums.WorkType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MaintenanceRepository extends JpaRepository<MaintenanceRecord, Long> {
    List<MaintenanceRecord> findBySubstationId(Long substationId);

    List<MaintenanceRecord> findBySubstationIdAndWorkType(Long substationId, WorkType workType);

    List<MaintenanceRecord> findBySubstationIdAndStartDateBetween(
            Long substationId, LocalDate startDateFrom, LocalDate startDateTo);

    List<MaintenanceRecord> findBySubstationIdAndWorkTypeAndStartDateBetween(
            Long substationId, WorkType workType, LocalDate startDateFrom, LocalDate startDateTo);
}
