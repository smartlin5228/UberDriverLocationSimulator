package com.tianyang.lin.domain;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LocationRepository extends JpaRepository<Location, Long>{
    Page<Location> findVehicleMovementByType(@Param("movementType") Location.VehicleMovementType movementType, Pageable pageable);
    Page<Location> findVehicleMovementByUnitVin(@Param("unitVin") String unitVin, Pageable pageable);
}
