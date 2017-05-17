package Food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by УВД on 20.03.2017.
 */
public class Provision {
    public void provision() {
        ApplicationContext context=new AnnotationConfigApplicationContext(Check.class);
        Ambar ambar= (Ambar) context.getBean("ambar");
        Text text=new Text();
        text.getInfo();
        ambar.getApple();
        ambar.getBread();
        ambar.getMeet();
        ambar.getMilk();
    }
}
