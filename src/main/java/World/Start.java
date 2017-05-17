package World;

import Castle.Building;
import Food.Provision;
import Hero.MainMoveHero;

/**
 * Created by УВД on 20.03.2017.
 */
public class Start {
    public static void main(String[] args) {
        Provision provision=new Provision();
        Building building=new Building();
        MainMoveHero mainMoveHero=new MainMoveHero();
        building.building();
        provision.provision();
        mainMoveHero.checkAll();
    }
}
