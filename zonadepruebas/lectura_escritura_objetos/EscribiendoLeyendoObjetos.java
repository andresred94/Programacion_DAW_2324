package lectura_escritura_objetos;
import java.io.*;
import java.util.TreeSet;

public class EscribiendoLeyendoObjetos {
	public static void main(String[] args) {
        // Crear un TreeSet y agregar algunos elementos
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Elemento 1");
        treeSet.add("Elemento 2");
        treeSet.add("Elemento 3");

        // Ruta del archivo .dat
        String filename = "treeset.dat";
        
        String ruta = "\\..\\archivos\\nombArchi";
		String rutaArchivo = ruta.replaceAll("nombArchi", filename);

        // Serializar el TreeSet a un archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaArchivo,true))) {
            oos.writeObject(treeSet);
            System.out.println("TreeSet serializado exitosamente en " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserializar el TreeSet desde el archivo
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaArchivo))) {
            TreeSet<String> deserializedTreeSet = (TreeSet<String>) ois.readObject();
            System.out.println("TreeSet deserializado exitosamente desde " + filename);
            System.out.println("Contenido del TreeSet: " + deserializedTreeSet);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
