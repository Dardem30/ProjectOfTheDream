package Hero;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.*;
import java.util.List;

/**
 * Created by УВД on 28.03.2017.
 */
public class HeroDatabase implements DAO{
    private DataSource dataSource;
JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    @Override
    @SuppressWarnings({ "unchecked" })
    public Hero getById(int id) {
        String query="SELECT * FROM heroes WHERE idhero=?";
         Hero hero=jdbcTemplate.queryForObject(query,new Object[]{id},new HeroRowMapper());
         return hero;
    }

    @Override
    public List<Hero> getAllHeroInCastle() {
        String query="SELECT * FROM heroes";
        List<Hero> heroes=jdbcTemplate.query(query,new HeroRowMapper());
        return heroes;
    }

    @Override
    public void saveHero(Hero hero) {
        String query="INSERT INTO heroes(idhero,name) VALUES(?,?)";
        jdbcTemplate.update(query,hero.getIdhero(),hero.getName());
    }

    @Override
    public void update(Hero hero) {

    }

    @Override
    public void delete(Hero hero) {

    }
}
