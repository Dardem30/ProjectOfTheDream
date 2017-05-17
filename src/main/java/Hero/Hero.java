package Hero;

/**
 * Created by УВД on 28.03.2017.
 */
public class Hero {
    int idhero;
    String name;

    public int getIdhero() {
        return idhero;
    }

    public void setIdhero(int idhero) {
        this.idhero = idhero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "idhero=" + idhero +
                ", name='" + name + '\'' +
                '}';
    }
}
