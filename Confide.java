package Skills;
import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 1);
	}
	protected String describe(){
		return "Confide";
	}
	protected void applyOppEffests(Pokemon p) {
        	p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));
	}
}