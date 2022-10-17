package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Escavalier extends Karrablast{
	public Escavalier(String name, int lv1){
		super(name, lv1);
		this.setStats( 70, 135, 105, 60, 105, 20);
		this.setType(Type.BUG, Type.STEEL);
		this.setMove(new XScissor(), new Confide(), new SwordsDance(), new IronHead());
	}
}