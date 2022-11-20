package com.techelper.tropsmart_backend.cargo.domain.services;


import com.techelper.tropsmart_backend.cargo.domain.models.SensorInfo;
import com.techelper.tropsmart_backend.cargo.domain.services.comunications.SensorResponse;
import com.techelper.tropsmart_backend.configuration.domain.services.ICrudService;

public interface ISensorService extends ICrudService<SensorInfo> {
    SensorResponse getCurrentSensorInfo(int cargoId);
    SensorResponse setSensorInfo(int cargoId);
}