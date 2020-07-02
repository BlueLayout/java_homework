package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;

public class Car extends Vehicle {

    Car(BigDecimal budget){
        this.budget = budget;
        this.name = "Car";
    }

    BigDecimal getBudget(){
        return this.budget;
    }

}
