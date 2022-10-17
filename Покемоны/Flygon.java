package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Flygon extends Vibrava{
	public Flygon(String name, int lv1){
		super(name, lv1);
		this.setStats(80, 100, 80, 80, 80, 100);
		this.setType(Type.GROUND, Type.DRAGON);
		this.setMove(new MudSlap(), new Facade(), new BugBuzz(), new RockTomb());
	}
}