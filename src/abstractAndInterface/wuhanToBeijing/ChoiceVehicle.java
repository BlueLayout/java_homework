package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChoiceVehicle {

    public static void main(String[] args) {
        Car WBCar = new Car(new BigDecimal("500"));
        Bus WBBus = new Bus(new BigDecimal("300"));
        Train WBTrain = new Train(new BigDecimal("400"));
        Plane WBPlane = new Plane(new BigDecimal("1000"));

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(WBCar);
        vehicleList.add(WBBus);
        vehicleList.add(WBPlane);
        vehicleList.add(WBTrain);
        TripPlan wuhanToBeijingTripPlan = new TripPlan("Wuhan","Beijing",vehicleList);

        //budget of 500 yuan
        List<Vehicle> vehicleList1 = wuhanToBeijingTripPlan.vehicleList;
        for (Vehicle vehicle:vehicleList1
             ) {
            if (vehicle.budget.compareTo(new BigDecimal("500"))!=1){
                System.out.println("Vehicle:"+vehicle.name+",Budget:"+vehicle.budget);
            }
        }

    }
}
