package Food;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by УВД on 20.03.2017.
 */
@Component("milk")
public class Milk {
    @Value("1000")
    int liters;

    public int getLiters() {
        System.out.println("литров молока:");
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }
}
