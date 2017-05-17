package Food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by УВД on 20.03.2017.
 */
@Component("ambar")
public class Ambar {
    @Autowired
            @Qualifier("apple")
    Apple apple;
    @Autowired
    @Qualifier("bread")
    Bread bread;
    @Autowired
    @Qualifier("meet")
    Meet meet;
    @Autowired
    @Qualifier("milk")
    Milk milk;

    public void getApple() {
        System.out.println("килограммов яблок: ");
        System.out.println(apple.getPounds());
    }
    public void getBread(){
        System.out.println(bread.getPounds());
    }
    public void getMeet(){
        System.out.println(meet.getPounds());
    }
    public void getMilk(){
        System.out.println(milk.getLiters());
    }
}
