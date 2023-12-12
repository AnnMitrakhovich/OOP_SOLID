package Pattern_Adapter;

import java.time.LocalDateTime;

public class AdapterSensorTemperature implements MeteoSensor{
    SensorTemperature adapt;

    public AdapterSensorTemperature(SensorTemperature adaptee) {
        this.adapt = adaptee;
    }

    @Override
    public int getId() {
        return adapt.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)adapt.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adapt.year(), 1,1,0,0);
        dateTime = dateTime.plusDays(adapt.day() - 1);
        dateTime = dateTime.plusSeconds(adapt.second());
        return dateTime;
    }
}