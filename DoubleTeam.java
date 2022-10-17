package Skills ;
import ru.ifmo.se.pokemon.*;
public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 1);
    }

    protected String describe() {
        return "DoubleTeam";
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.EVASION, 1);
    }
}