package colecNBA;

import java.util.*;

public class CompararJugadorEquipo implements Comparator <Jugador>{
	@Override
	public int compare(Jugador o1, Jugador o2) {
		return o1.getNomEquipo().compareToIgnoreCase(o2.getNomEquipo());
	}

}
