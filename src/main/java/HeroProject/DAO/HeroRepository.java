package HeroProject.DAO;

import HeroProject.Model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

//we need to extend JPArepository<Model, Primary key type>

//the transactional annotation wraps methods inside of a database transaction, so that one method doesn't accidentally
//influence the result of another
@Transactional
public interface HeroRepository extends JpaRepository<Hero, Integer> {
    /*
    JPQL:
    Java persistence query language
     */
    @Query("from Hero")
    public List<Hero> findAllHero();

    @Query("from Hero where name = :name")
    public Hero findHeroByName(@Param("name") String name);

    @Query("from Hero where power = (select max(power) from Hero)")
    public Hero findMaxPowerHero();

    @Query("from Hero where name = (select max(name) from Hero)")
    public Hero findLastHeroAlphabetically();

}