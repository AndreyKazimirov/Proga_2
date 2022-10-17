package Skills;
import ru.ifmo.se.pokemon.*;
public class RockTomb extends PhysicalMove {
	public RockTomb(){
        	super(Type.ROCK, 60, 0.95);
    	}

    	protected String describe() {
        	return "RockTomb";
    }

        protected void applyOppEffects(Pokemon p) {
            	p.addEffect(new Effect().chance(0.25).stat(Stat.SPEED, -1));
    	}
}