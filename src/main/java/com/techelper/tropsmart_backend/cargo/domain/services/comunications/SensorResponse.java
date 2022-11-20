package com.techelper.tropsmart_backend.cargo.domain.services.comunications;

import com.techelper.tropsmart_backend.cargo.domain.services.outputs.SensorOutput;
import com.techelper.tropsmart_backend.configuration.domain.services.comunications.BaseResponse;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SensorResponse extends BaseResponse<SensorOutput> {
    public SensorResponse(List<SensorOutput> sensorOutputList) {super(sensorOutputList);}
    public SensorResponse(SensorOutput sensorOutput){super(sensorOutput);}
    public SensorResponse(String message) {super(message);}

}
