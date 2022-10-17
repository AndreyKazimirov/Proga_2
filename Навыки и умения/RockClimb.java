package Skills;
import ru.ifmo.se.pokemon.*;
public class RockClimb extends PhysicalMove{
	public RockClimb(){
		super(Type.NORMAL, 90, 0.85);
	}
	protected String describe(){
		return "RockClimb";
	}
	protected void appluOppEffects(Pokemon p){
		if (Math.random() <=0.2);
			Effect.confuse(p);
	}
}