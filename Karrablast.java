package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Karrablast extends Pokemon{
	public Karrablast(String name, int lv1){
		super(name, lv1);

		this.setStats(50, 75, 45, 40, 45, 60);
		this.setType(Type.BUG);
		this.setMove(new XScissor(), new Confide(), new SwordsDance());
	}
}