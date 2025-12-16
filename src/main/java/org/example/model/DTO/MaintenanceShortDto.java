package org.example.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.enums.WorkType;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaintenanceShortDto {
    private Long id;
    private WorkType workType;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double cost;

}
