package Skills;
import ru.ifmo.se.pokemon.*;
public class SwordsDance extends StatusMove{
	public SwordsDance(){
		super(Type.NORMAL, 0, 1);
	}
	protected String describe(){
		return "SwordsDance";
	}
	protected void applySelfEffects(Pokemon p) {
        	p.setMod(Stat.ATTACK, 2);
	}
}