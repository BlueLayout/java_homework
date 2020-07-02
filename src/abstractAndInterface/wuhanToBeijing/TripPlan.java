package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author devin
 */
public class TripPlan {

    List<Vehicle> vehicleList;

    String startPoint;

    String objective;

    TripPlan(String startPoint,String objective,List<Vehicle> vehicles){
        this.startPoint = startPoint;
        this.objective = objective;
        this.vehicleList = vehicles;
    }

}
