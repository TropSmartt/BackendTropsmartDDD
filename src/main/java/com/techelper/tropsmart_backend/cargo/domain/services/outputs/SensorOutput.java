package com.techelper.tropsmart_backend.cargo.domain.services.outputs;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SensorOutput {
    private double temperature;
    private double humidity;
    private double pressure;
    private int id;
}
