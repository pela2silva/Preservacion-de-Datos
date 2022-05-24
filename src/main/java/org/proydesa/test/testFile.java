package org.proydesa.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.proydesa.clases.EmpleadoE;

public class testFile {

    public static void main(String[] args) {

        List<EmpleadoE> empleado = new ArrayList<>();

        empleado.add(new EmpleadoE(1, "Pablo Rodriguez 545", "Martin"));
        empleado.add(new EmpleadoE(1, "Juan b justo 521", "Martin"));
        empleado.add(new EmpleadoE(2, "Jujuy 2000", "Marcelo"));
        empleado.add(new EmpleadoE(1, "Cramer 600", "Martin"));
        empleado.add(new EmpleadoE(1, "Jeronimo Cabrera 1001", "Martin"));
        empleado.add(new EmpleadoE(2, "Avellaneda 250", "Marcelo"));
        empleado.add(new EmpleadoE(1, "Alem 54", "Martin"));
        empleado.add(new EmpleadoE(3, "Pingles 725", "Mario"));

        String ruta = "C:\\Users\\CC16744644\\Desktop\\JAVA\\Intermedio\\Clase 9\\Actividades.txt";

        escritura(empleado, ruta);
        lectura(ruta);

    } // Fin de la main

    // METODO LECTURA
    public static void lectura(String direccion) {

        try {
            FileReader lector = new FileReader(direccion);
            BufferedReader bf = new BufferedReader(lector);

            String linea = bf.readLine();

            while (linea != null) {

                System.out.println(linea);
                linea = bf.readLine();
            }
            bf.close();
            lector.close();
        } catch (IOException ex) {
            System.out.println("## ERROR DE LECTURA !! ##");
            ex.printStackTrace(System.out);
        }
    } // Fin de lectura

    // METODO TRASLADO
    public static void escritura(List<EmpleadoE> lista, String direccion) {

        // AGREGO FECHA
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY\n");
        String fechaPersonal = sdf.format(fecha);

        List<String> usar = lista.stream().map(x -> x + "\n").collect(Collectors.toList());
        Collections.sort(usar);

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(direccion, true));

            //bw.write(fechaPersonal);
            for (String e : usar) {
                bw.write(fechaPersonal);
                bw.write(e);
            }

            bw.close();
        } catch (IOException ex) {
            System.out.println("###  ERROR DE TRASLADO !!  ###");
            ex.printStackTrace(System.out);
        }
    } // Fin de escritura

} // Fin de la clase
