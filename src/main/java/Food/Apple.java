package Food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by УВД on 20.03.2017.
 */
@Component("apple")
public class Apple {
    @Value("1000")
    int pounds;

    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }
}
