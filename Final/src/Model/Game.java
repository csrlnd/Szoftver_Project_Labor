package Model;

import java.util.Random;

public class Game {
	private GameMap gameMap;
	public void Start() {
		//egy virol�gus l�trehoz�sa �s elhelyez�se a p�ly�n
		Virologist v1 = new Virologist();
		Field f;
		Random r = new Random();
		int i = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		f = gameMap.getFields().get(i);
		f.acceptVirologists(v1);
		v1.setCurrentfield(f);
		
		//egy m�sik virol�gus l�trehoz�sa �s elhelyez�se a p�ly�n az el�z�vel nem azonos mez�re
		Virologist v2 = new Virologist();
		int j = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		
		//ha azonos index� mez�re akarn� tenni
		while(j == i) {
			j = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		}
		f = gameMap.getFields().get(j);
		f.acceptVirologists(v2);
		v2.setCurrentfield(f);
	}
	
	public void End() {
	}
}
