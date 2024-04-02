package probandoArrayslist;

import java.util.*;

public class MiPrimerArrayList {
    public static void main(String[] args) {


        ArrayList<String> l = new ArrayList<>();

        l.add("elena");
        l.add("julio");
        l.add("darío");
        l.add("lucía");

        System.out.println(l);

        l.add(1, "maría");

        System.out.println(l);
        l.set(3, "DARIO");

        System.out.println(l);
        System.out.println("En la posición de índice 3 está: "+l.get(3));

        //Borrar por objeto
        l.remove("dario");
        System.out.println(l);


        //Borrar por índice
        l.remove(0);
        System.out.println(l);

        //Tamaño de la lista
        System.out.println("El tamaño de la lista es: "+ l.size());

        //Check si contiene un elemento
        if (l.contains("julio"))
        System.out.println("julio está en la lista");

        //Recorrer lista
        for(int i=0; i< l.size(); i++)
            System.out.println("Posición " + i + " valor: "+ l.get(i));

        //Recorrer lista usando el método creado
        System.out.println("Recorrer lista usando el método creado (for)");
        recorrerLista(l);

        //Recorrer lista usando el método 2 creado
        System.out.println("Recorrer lista usando el método creado (foreach)");
        recorrerLista2(l);



        //Borramos la lista
        l.clear();
        System.out.println(l);

    }

    //Recorre lista en un método específico (for)
    public static void recorrerLista (ArrayList<String> l ) {
        for (int i = 0; i < l.size(); i++)
            System.out.println("Posición " + i + " valor: " + l.get(i));
    }
    //Recorre lista en un método específico (foreach)
   public static void recorrerLista2 (ArrayList<String> l ) {

        for (String s: l)
            System.out.println(" valor: " + s);
    }
}