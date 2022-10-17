package Skills;
import ru.ifmo.se.pokemon.*;
public class DarkPulse extends SpecialMove{
	public DarkPulse() {super(Type.DARK, 80, 1); }

	protected String describe(){
		return "DarkPulse";
	}
	protected void appluOppEffects(Pokemon p){
		if (Math.random() <=0.2);
			Effect.flinch(p);
	}
}