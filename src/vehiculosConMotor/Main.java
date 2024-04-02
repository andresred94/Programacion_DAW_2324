package vehiculosConMotor;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Turismos> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new Turismos("Fiat","Punto","Negro",false,"4183FYT",LocalDate.of(2007, 1, 1), ModalidadSeguro.TERCEROS, 4, TipoDeUso.PARTICULAR ));
        listaVehiculos.add(new Turismos("Seat","Ibiza","Negro",false,"4183FYT",LocalDate.of(2007, 1, 1), ModalidadSeguro.TERCEROS, 4, TipoDeUso.PARTICULAR ));
        listaVehiculos.add(new Turismos("Volkswagen","Golf","Negro",true,"4183FYT",LocalDate.of(2007, 1, 1), ModalidadSeguro.TERCEROS, 4, TipoDeUso.PARTICULAR ));
        listaVehiculos.add(new Turismos("Honda","Civic","Negro",false,"4183FYT",LocalDate.of(2007, 1, 1), ModalidadSeguro.TERCEROS, 4, TipoDeUso.PARTICULAR ));
        listaVehiculos.add(new Turismos("Renault","Clio","Negro",false,"4183FYT",LocalDate.of(2007, 1, 1), ModalidadSeguro.TERCEROS, 4, TipoDeUso.PARTICULAR ));
        
        // mostrar la lista de vehiculos
        for (int i = 0; i < listaVehiculos.size(); i++) {
			System.out.println(listaVehiculos.get(i).toString());
		}
        System.out.println("Modelos que empiezan por C");
        // mostrar los vehiculos cuyo modelo empieza por C
        for (int i = 0; i < listaVehiculos.size(); i++) {
        	if (listaVehiculos.get(i).getModelo().startsWith("C")) {
				System.out.println(listaVehiculos.get(i).toString());
			} 
        }

	}
}// fin-class Main
