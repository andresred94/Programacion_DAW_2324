package probandoTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class EjemploTreeMapSimple {
	 public static void main(String[] args) {
	        // Crear un TreeMap
	        TreeMap<Integer, String> treeMap = new TreeMap<>();

	        // Agregar elementos al TreeMap
	        treeMap.put(3, "Tres");
	        treeMap.put(1, "Uno");
	        treeMap.put(2, "Dos");

	        // Imprimir el TreeMap
	        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
	            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
	        }
	    }
}
