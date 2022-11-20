package com.techelper.tropsmart_backend.cargo.domain.repositories;

import com.techelper.tropsmart_backend.cargo.domain.models.SensorInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISensorRepository extends JpaRepository<SensorInfo, Integer> {
}
