package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Vibrava extends Trapinch{
	public Vibrava(String name, int lv1){
		super(name, lv1);
		this.setStats(50, 70, 50, 50, 50, 70);
		this.setType(Type.GROUND, Type.DRAGON);
		this.setMove(new MudSlap(), new Facade(), new BugBuzz());
	}
}