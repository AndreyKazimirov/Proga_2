package Skills;
import ru.ifmo.se.pokemon.*;
public class Facade extends PhysicalMove {
	public Facade(){
        	super(Type.NORMAL, 70, 1);
    	}

		protected void appluOppDamage(Pokemon def, double damage){
			super.applyOppDamage(def, damage);
			if ((def.getCondition()==Status.PARALYZE) || (def.getCondition()==Status.BURN) || (def.getCondition()==Status.POISON)){
				def.setMod(Stat.HP, (int) Math.round(2*damage));
			}

		}

    	protected String describe() {
        	return "Facade";
		}


}