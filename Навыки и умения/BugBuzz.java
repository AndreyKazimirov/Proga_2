package Skills;
import ru.ifmo.se.pokemon.*;
public class BugBuzz extends SpecialMove {
	public BugBuzz(){
        	super(Type.BUG, 90, 1);
    	}

    	protected String describe() {
        	return "BugBuzz";
    }

        protected void applyOppEffects(Pokemon p) {
		if (Math.random() <=0.1);
            		p.addEffect(new Effect().chance(0.25).stat(Stat.SPECIAL_DEFENSE, -1));
    	}
}