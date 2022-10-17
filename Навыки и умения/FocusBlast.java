package Skills;
import ru.ifmo.se.pokemon.*;
public class FocusBlast extends SpecialMove{
	public FocusBlast(){
		super(Type.FIGHTING, 120, 0.7);
	}
	protected String describe(){
		return "FocusBlast";
	}
	protected void appluOppEffects(Pokemon p){
		if (Math.random() <=0.1);
			p.addEffect(new Effect().chance(0.25).stat(Stat.SPECIAL_DEFENSE, -1));
	}
}