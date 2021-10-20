package concesionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el número de coches que tendrá el concesionario: ");
        int numero_coches = Integer.parseInt(entrada.nextLine());

        //ArrayList que almacenará la lista de coches
        ArrayList<Coche> lista_coches = new ArrayList<Coche>();

        for (int i = 1; i <= numero_coches; i++) {
            System.out.println("Introduzca los datos del coche nº " + i);

            System.out.print("Marca: ");
            String marca = entrada.nextLine();

            System.out.print("Modelo: ");
            String modelo = entrada.nextLine();

            System.out.print("Año: ");
            int año = Integer.parseInt(entrada.nextLine());

            System.out.print("Matrícula: ");
            String matricula = entrada.nextLine();

            //Coche coche = new Coche(marca, modelo, año, matricula);
            Coche coche = new Coche();
            coche.setMarca(marca);
            coche.setModelo(modelo);
            coche.setAño(año);
            coche.setMatricula(matricula);
            lista_coches.add(coche);
        }
        System.out.println("\n\n#######################################");
        System.out.println("Número de coches en el concesionario: " + Coche.contador_de_coches);

        //ForEach que recorre la lista de coches e imprime por pantalla los coches
        for (Coche coche : lista_coches) {
            System.out.println("" + coche.toString());
        }
    }
}
