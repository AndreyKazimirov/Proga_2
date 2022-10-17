package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Trapinch extends Pokemon{
	public Trapinch(String name, int lv1){
		super(name, lv1);
		this.setStats(45, 100, 45, 45, 45, 10);
		this.setType(Type.GROUND);
		this.setMove(new MudSlap(), new Facade());
	}


}