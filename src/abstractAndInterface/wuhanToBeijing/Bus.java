package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;

public class Bus extends Vehicle {
    Bus(BigDecimal budget){
        this.budget = budget;
        this.name = "Bus";
    }

    BigDecimal getBudget(){
        return this.budget;
    }
}
