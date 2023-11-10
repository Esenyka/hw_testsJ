import hw2.project.Car;
import hw2.project.Motorcycle;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.FactoryBasedNavigableIterableAssert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VehicleTest {
    @Test
    public void motorcycleTestNumWheels() {
        Motorcycle motorcycle = new Motorcycle("toyota", "mark", 2012);
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void carTestNumWheels() {
        Car car = new Car("toyota", "mark", 2012);
        assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void carTestSpeed() {
        Car car = new Car("toyota", "mark", 2012);
        car.testDrive();
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void motorcycleTestSpeed() {
        Motorcycle motorcycle = new Motorcycle("toyota", "mark", 2012);
        motorcycle.testDrive();
        assertEquals(motorcycle.getSpeed(), 60);
    }

    @Test
    public void carTestMove() {
        Car car = new Car("toyota", "mark", 2012);
        car.testDrive();
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void motorcycleTestMove() {
        Motorcycle motorcycle = new Motorcycle("toyota", "mark", 2012);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }


}
