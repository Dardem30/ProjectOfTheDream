package Castle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by УВД on 20.03.2017.
 */
public class Building {
    public void building() {
        Text text=new Text();
        ApplicationContext context=new ClassPathXmlApplicationContext("Castle.xml");
        Masons masons= (Masons) context.getBean("masons");
        Gates gates=masons.makeGates();
        Hill hill=masons.makeHill();
        Wall wall=masons.makeWall();
        text.getInfo();
        System.out.println(gates.getGates());
        System.out.println(hill.getHill());
        System.out.println(wall.getWall());
        Barraks barraks=masons.makeBarraks();
        Knight knight=barraks.makeKnight();
        Archers archers=barraks.makeArchers();
        Spierman spierman=barraks.makeSpearman();
        System.out.println();
        text.getInfoAboutGarnizon();
        System.out.println(knight.getPeople());
        System.out.println(archers.getPeople());
        System.out.println(archers.getArrow());
        System.out.println(spierman.getPeople());
    }
}
