package Skills;
import ru.ifmo.se.pokemon.*;
public class MudSlap extends SpecialMove {
public MudSlap(){
        super(Type.GROUND, 20, 1);
        }

protected String describe() {
        return "MudSlap";
        }

protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.25).stat(Stat.ACCURACY, -1));
        }
        }