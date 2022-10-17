import ru.ifmo.se.pokemon.*;
import Pokemons.*;

public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon p1 = new Druddigon("Чужой", 1);
		Pokemon p2 = new Karrablast("Хищник", 2);
		Pokemon p3 = new Escavalier("Витя", 3);
		Pokemon p4 = new Escavalier("Саня", 4);
		Pokemon p5 = new Escavalier("Митя", 5);
		Pokemon p6 = new Escavalier("Валера", 6);
		b.addAlly(p1);
		b.addAlly(p3);
		b.addAlly(p4);
		b.addFoe(p2);
		b.addFoe(p5);
		b.addFoe(p6);


		b.go();
	}
}