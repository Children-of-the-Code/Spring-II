package HeroProject.Service;

import HeroProject.DAO.HeroRepository;
import HeroProject.Model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeroService {
    HeroRepository heroRepository;
    @Autowired
    public HeroService(HeroRepository heroRepository){
        this.heroRepository = heroRepository;
    }
    public List<Hero> getAllHero(){
        return heroRepository.findAll();
    }
    public void saveHero(Hero hero){
        heroRepository.save(hero);
    }
    public Hero getMaxPowerHero(){
        return heroRepository.findMaxPowerHero();
    }
    public Hero getHeroByName(String name){
        return heroRepository.findHeroByName(name);
    }
    public Hero getLastHeryAlphabetically(){
        return heroRepository.findLastHeroAlphabetically();
    }
}
