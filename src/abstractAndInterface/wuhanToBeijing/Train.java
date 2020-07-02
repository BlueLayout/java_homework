package abstractAndInterface.wuhanToBeijing;

import java.math.BigDecimal;

public class Train extends Vehicle {

    Train(BigDecimal budget){
        this.budget = budget;
        this.name = "Train";
    }

    BigDecimal getBudget(){
        return this.budget;
    }
}
