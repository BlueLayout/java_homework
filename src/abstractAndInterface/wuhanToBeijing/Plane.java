package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;

public class Plane extends Vehicle {
    Plane(BigDecimal budget){
        this.budget = budget;
        this.name = "Plane";
    }

    BigDecimal getBudget(){
        return this.budget;
    }
}
