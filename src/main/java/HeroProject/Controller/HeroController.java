package HeroProject.Controller;

import HeroProject.Model.Hero;
import HeroProject.Service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("heroes")
public class HeroController {
    HeroService heroService;
//    there are 3 different places to place to autowired annotation:
//    constructor, field, setter method
//    beans have different scopes - by default, they are singleton scoped (1 copy exists across the entire application)
//    there is also prototype (new bean created every time)
//    http request, session, websocket
    @Autowired
    public HeroController(HeroService heroService){
        this.heroService = heroService;
    }
    @GetMapping
    public List<Hero> getAllHero(){
        return heroService.getAllHero();
    }
    @PostMapping
    public void saveHero(@RequestBody Hero hero){
        heroService.saveHero(hero);
    }
    @GetMapping("max")
    public Hero getMaxPowerHero(){
        return heroService.getMaxPowerHero();
    }
    @GetMapping("name/{name}")
    public Hero getHeroByName(@PathVariable String name){
        return heroService.getHeroByName(name);
    }
    @GetMapping("last")
    public Hero getLastHeroAlphabetically(){
        return heroService.getLastHeryAlphabetically();
    }
}
