package Pokemons;
import ru.ifmo.se.pokemon.*;
import Skills.*;

public class Druddigon extends Pokemon{
	public Druddigon(String name, int lv1){
		super(name, lv1);

		this.setStats(77, 120, 90, 60, 90, 48);
		this.setType(Type.DRAGON);
		this.setMove(new DarkPulse(), new RockClimb(), new FocusBlast(), new DoubleTeam());
	}


}