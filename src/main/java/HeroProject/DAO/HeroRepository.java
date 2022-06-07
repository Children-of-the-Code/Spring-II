package HeroProject.DAO;

import HeroProject.Model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//we need to extend JPArepository<Model, Primary key type>
public interface HeroRepository extends JpaRepository<Hero, Integer> {
    /*
    JPQL:
    Java persistence query language
     */
    @Query("from Hero")
    public List<Hero> findAllHero();

    @Query("from Hero where name = :name")
    public Hero findHeroByName(String name);

    @Query("from Hero where power = (select max(power) from Hero)")
    public Hero findMaxPowerHero();

}