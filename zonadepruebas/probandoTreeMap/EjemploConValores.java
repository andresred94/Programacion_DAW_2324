package probandoTreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EjemploConValores {
	public static void main(String[] args) {
        // Crear un TreeMap con un Comparator personalizado para ordenar por valores
//        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer k1, Integer k2) {
//                return treeMap.get(k1).compareTo(treeMap.get(k2));
//            }
//        });

        // Crear un TreeMap
        TreeMap<Integer, MyObject> treeMap = new TreeMap<>();

        // Agregar elementos al TreeMap
        treeMap.put(3, new MyObject(3, "Object 3"));
        treeMap.put(1, new MyObject(1, "Object 1"));
        treeMap.put(2, new MyObject(2, "Object 2"));

        // Imprimir el TreeMap
        for (Map.Entry<Integer, MyObject> entry : treeMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
}
