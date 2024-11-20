package RepasoJava;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Se requiere desarrollar un programa que permita ingresar la estatura y el peso de los estudiantes
        // de un curso el usuario debe indicar cuantos estudiantes van a ser ingresados en el sistema.
        //Luego el sistema debera indicar mediante un menu la estatura
        //1.Estatdisticas de la altura
        //2.Estadisticas de peso
        //3.Estadisticas del indice de masa corporal
        // y en cada uno de estos indicar maximos, minimos y promedios


        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        double maxAltura = 0, minAltura = 0, promAltura = 0, maxPeso = 0, minPeso = 0, promPeso = 0, maxImc = 0, minImc = 0,
                promImc = 0, sumAltura = 0, sumPeso = 0, sumImc = 0;


        System.out.println("Señor usuario favor ingresar la cantidad " + cantidad + " de estudiantes a ingresar en el sistema");
        cantidad = sc.nextInt();

        double[] estaturas = new double[cantidad];
        double[] peso = new double[cantidad];
        double[] imc = new double[cantidad];
        String[] nombres = new String[cantidad];
        int indice =0;
        int opc = 0;


        for (int n = 0; n < nombres.length; n++) {
            System.out.println("Señor usuario favor ingresar el nombre del estudiante " + (n + 1));
            nombres[n] = sc.next();
        }

        for (int i = 0; i < estaturas.length; i++) {
            System.out.println("Señor usuario favor ingresar la estatura del estudiante " + nombres[i]);
            estaturas[i] = sc.nextDouble();
            sumAltura += estaturas[i];
        }

        for (int k = 0; k < peso.length; k++) {
            System.out.println("Señor usuario favor ingresar el peso del estudiante " + nombres[k]);
            peso[k] = sc.nextDouble();
            sumPeso += peso[k];
        }

        //Calcular imc
        for (int o = 0; o < imc.length; o++) {
            imc[o] = peso[o] / Math.pow(estaturas[o], 2);
            sumImc += imc[o];
        }

        //Obtener altura maxima

        for (int l = 0; l < estaturas.length; l++) {
            maxAltura = estaturas[0];
            if (maxAltura < estaturas[l]) {
                maxAltura = estaturas[l];
                indice=l;
            }
        }
        //Obtener peso maxima
        for (int l = 0; l < peso.length; l++) {
            maxPeso = peso[0];
            if (maxPeso < peso[l]) {
                maxPeso = peso[l];
                indice=l;
            }
        }
        for (int l = 0; l < peso.length; l++) {
            maxImc = imc[0];
            if (maxImc < imc[l]) {
                maxImc = imc[l];
                indice=l;
            }
        }
        //Obtener el minimo

        for (int l = 0; l < estaturas.length; l++) {
            minAltura = estaturas[0];
            if (minAltura > estaturas[l]) {
                minAltura = estaturas[l];
                indice=l;
            }
        }

        for (int l = 0; l < peso.length; l++) {
            minPeso = peso[0];
            if (minPeso > peso[l]) {
                minPeso = peso[l];
                indice=l;
            }
        }

        for (int l = 0; l < peso.length; l++) {
            minImc = imc[0];
            if (minImc > imc[l]) {
                minImc = imc[l];
                indice=l;
            }
        }
        //Calcular promedios

        promPeso = sumPeso/cantidad;

        promAltura = sumAltura/cantidad;

        promImc = sumImc/cantidad;

        boolean salir =true;
        while (salir) {
            System.out.println("señor usuario favor ingresar una de las siguientes opciones\n" +
                    "1.Estadisticas de altura \n" +
                    "2.Estadisticas de peso \n" +
                    "3.Estadisticas imc \n" +
                    "4.Salir");


            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La altura maxima de "+nombres[indice]+" es : " + maxAltura);
                    System.out.println("La altura minima de "+nombres[indice]+" es : " + minAltura);
                    System.out.println("La altura promedio es: " + promAltura);
                    break;
                case 2:
                    System.out.println("El Peso maximo de "+nombres[indice]+" es : " + maxPeso);
                    System.out.println("El Peso minimo de "+nombres[indice]+" es : " + minPeso);
                    System.out.println("El Peso promedio es: " + promPeso);
                    break;
                case 3:
                    System.out.println("El Imc maximo es : " + maxImc);
                    System.out.println("El Imc minimo es : " + minImc);
                    System.out.println("El Imc promedio es: " + promImc);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro sistema");
                    salir=false;
                    break;


                default:
                    System.out.println("Opcion invalida");
            }
        }
    }
}
