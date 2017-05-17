package Castle;

/**
 * Created by УВД on 20.03.2017.
 */
public class Archers {
    int people;
int arrow;

    public int getPeople() {
        System.out.println("лучников: ");
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getArrow() {
        System.out.println("боезапас:");
        return arrow;
    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }
}
