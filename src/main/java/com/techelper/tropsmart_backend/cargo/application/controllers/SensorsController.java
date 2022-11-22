package com.techelper.tropsmart_backend.cargo.application.controllers;

import com.techelper.tropsmart_backend.cargo.domain.services.comunications.RouteResponse;
import com.techelper.tropsmart_backend.cargo.domain.services.comunications.SensorResponse;
import com.techelper.tropsmart_backend.cargo.infrastructure.servicesImp.RouteService;
import com.techelper.tropsmart_backend.cargo.infrastructure.servicesImp.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/sensors")
public class SensorsController {

    @Autowired
    private SensorService sensorService;

    @GetMapping("/{cargoId}")
    public ResponseEntity<SensorResponse> getCurrentSensorInfo(@PathVariable(value = "cargoId")int cargoId)
    {

        SensorResponse result = sensorService.getCurrentSensorInfo(cargoId);

        //if(!result.success)
        //    return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{cargoId}")
    public ResponseEntity<SensorResponse> setSensorInfo(@PathVariable(value = "cargoId")int cargoId)
    {
        SensorResponse result = sensorService.setSensorInfo(cargoId);

        //if(!result.success)
        //    return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
