package com.techelper.tropsmart_backend.cargo.infrastructure.servicesImp;

import com.techelper.tropsmart_backend.cargo.domain.models.SensorInfo;
import com.techelper.tropsmart_backend.cargo.domain.repositories.ICargoRepository;
import com.techelper.tropsmart_backend.cargo.domain.repositories.ISensorRepository;
import com.techelper.tropsmart_backend.cargo.domain.services.ISensorService;
import com.techelper.tropsmart_backend.cargo.domain.services.comunications.SensorResponse;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SensorService implements ISensorService {

    @Autowired
    ISensorRepository sensorRepository;

    @Autowired
    ICargoRepository cargoRepository;

    @Override
    public SensorResponse getCurrentSensorInfo(int cargoId) {
        return null;
    }

    @Override
    public SensorResponse setSensorInfo(int cargoId) {
        return null;
    }

    @Override
    public SensorInfo save(SensorInfo sensorInfo) throws Exception {
        return sensorRepository.save(sensorInfo);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        sensorRepository.deleteById(id);
    }

    @Override
    public Optional<SensorInfo> findById(Integer id) {
        return sensorRepository.findById(id);
    }

    @Override
    public List<SensorInfo> findAll() throws Exception {
        return sensorRepository.findAll();
    }
}
