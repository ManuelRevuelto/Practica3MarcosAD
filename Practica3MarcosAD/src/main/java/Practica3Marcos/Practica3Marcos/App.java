package Practica3Marcos.Practica3Marcos;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;

public class App {
	public static void main(String[] args) {

		ODB odb = ODBFactory.open("d:\\neodatis.test");

		Jugadores j1 = new Jugadores("María", "voleibol", "Madrid", 14);
		Jugadores j2 = new Jugadores("Miguel", "tenis", "Madrid", 15);
		Jugadores j3 = new Jugadores("Mario", "baloncesto", "Guadalajara", 15);
		Jugadores j4 = new Jugadores("Alicia", "tenis", "Madrid", 14);

		odb.store(j1);
		odb.store(j2);
		odb.store(j3);
		odb.store(j4);

		odb.close();

	}
}
