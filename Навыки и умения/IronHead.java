package Skills;
import ru.ifmo.se.pokemon.*;
public class IronHead extends PhysicalMove{
	public IronHead(){
		super(Type.STEEL, 80, 1);
	}
	protected String describe(){
		return "IronHead";
	}
	protected void appluOppEffects(Pokemon p){
		if (Math.random() <=0.3);
			Effect.flinch(p);
	}
}