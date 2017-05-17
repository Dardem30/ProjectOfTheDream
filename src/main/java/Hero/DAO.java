package Hero;

import java.util.List;

/**
 * Created by УВД on 28.03.2017.
 */
public interface DAO {
    public Hero getById(int id);
    public void delete(Hero hero);
    public void update(Hero hero);
    public void saveHero(Hero hero);
    public List<Hero> getAllHeroInCastle();
}
