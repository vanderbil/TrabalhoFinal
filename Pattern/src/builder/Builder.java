package builder;

import builder.CarType;
import builder.Engine;
import builder.GPSNavigator;
import builder.Transmission;
import builder.TripComputer;

public interface Builder {

	void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
