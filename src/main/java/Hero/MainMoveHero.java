package Hero;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by УВД on 28.03.2017.
 */
public class MainMoveHero {
    public void move(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Hero.xml");
        Hero hero=new Hero();
        hero.setIdhero(1);
        hero.setName("Aragorn");
        HeroDatabase heroDatabase= (HeroDatabase) context.getBean("hero");
        heroDatabase.saveHero(hero);
        System.out.println("герой прибыл "+hero.getName());
    }
    public void checkByID(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Hero.xml");
        HeroDatabase heroDatabase= (HeroDatabase) context.getBean("hero");
        System.out.println("в замке "+heroDatabase.getById(1));
    }
    public void checkAll(){
        ApplicationContext context=new ClassPathXmlApplicationContext("Hero.xml");
        HeroDatabase heroDatabase= (HeroDatabase) context.getBean("hero");
        System.out.println("в Хельмовой Пади "+heroDatabase.getAllHeroInCastle());
    }
}
