package Hero;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by УВД on 28.03.2017.
 */
public class HeroRowMapper implements RowMapper<Hero> {
    @Override
    public Hero mapRow(ResultSet resultSet, int i) throws SQLException {
        Hero hero=new Hero();
        hero.setIdhero(resultSet.getInt("idhero"));
        hero.setName(resultSet.getString("name"));
        return hero;
    }
}
