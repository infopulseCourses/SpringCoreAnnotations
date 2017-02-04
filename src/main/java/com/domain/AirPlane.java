package com.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Stepan
 */
@Component
public class AirPlane {

    @Autowired
    @Value("100")
    private Integer fuelConsumption;

    @Autowired
    private Staff pilot;

    @Autowired
    private Staff stewart;

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Integer fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Staff getPilot() {
        return pilot;
    }

    public void setPilot(Staff pilot) {
        this.pilot = pilot;
    }

    public Staff getStewart() {
        return stewart;
    }

    public void setStewart(Staff stewart) {
        this.stewart = stewart;
    }
}
