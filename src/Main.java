import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 12;
        int min = 1;
        int dado, res;
        int puntos = 15;
        int experiencia = 0;
        int envenenado = 0;
        int max1 = 3;
        int min1 = 1;


        System.out.println("\n*** BIENVENIDO AL JUEGO ***");
        System.out.println("\nPUNTO DE VIDA = 15");

        for (int turno = 1; puntos > 0 && experiencia < 50; turno++) {
            System.out.println("\nTurno " + turno+"\n");
            System.out.println("*** COMIENZA EL JUEGO ***");
            System.out.println("\nLANZA EL DADO...");
            teclado.nextLine();
            dado = ale.nextInt((max - min + 1)) + min;
            System.out.println("SSACASTE UN: " + dado);


            switch (dado) {

                case 1, 2:
                    puntos += 1;
                    System.out.println("*** ENCONTRASTE UNA FUENTE DE VIDA *** " + " HAZ GANADO 1 PUNTO DE VIDA");
                    System.out.println("TUS PUNTOS DE VIDA SON: " + puntos + "\n");
                    break;

                case 3, 4, 5:
                    puntos -= 5;
                    System.out.println("*** HAZ SIDO BRUTALMENTE ATACADO *** " + " HAZ PERDIDO 5 PUNTOS DE VIDA");
                    System.out.println("TUS PUNTOS DE VIDA SON: " + puntos + "\n");
                    break;

                case 6, 7:
                    experiencia += 3;
                    System.out.println("*** HAZ GANADO EXPERIENCIA EN LA AVENTURA *** " + " HAZ GANADO 3 PUNTOS DE EXPERIENCIA");
                    System.out.println("TUS PUNTOS DE EXPERIENCIA SON: " + experiencia);
                    break;

                case 8, 9:
                    experiencia -= 6;
                    System.out.println("*** ACABAS DE COMETER UN GRAVE ERROR ***" + " HAZ PERDIDO 6 PUNTOS DE EXPERIENCIA ");
                    System.out.println("TUS PUNTOS DE EXPERIENCIA SON: " + experiencia);
                    break;

                case 10, 11:
                    puntos -= 8;
                    System.out.println("*** !! OHH NOO ¡¡ ACABAS DE CAER EN UNA TRAMPA LETAL *** " + " HAZ PERDIDO 8 PUNTOS DE VIDA ");
                    System.out.println("TUS PUNTOS DE VIDA SON: " + puntos);
                    break;

                case 12:
                    res = ale.nextInt((max1 - min1 + 1)) + min1;

                    if (res == 1) {
                        experiencia += 10;
                        System.out.println(" FELICIDADES ACABAS DE ENCONTAR UN PERGAMINO ANTIGUO ");
                        System.out.println("TU PUNTOS DE EXPERIENCIA ACTUAL SON: " + experiencia);
                    } else if (res == 2) {
                        envenenado = 1;
                        System.out.println("LO LAMNETO MUCHO HAZ SIDO INFECTADO CON VENENO");
                    }
                    if (res == 3) {
                        puntos /= 2;
                        System.out.println(" HAZ SIDO BRUTALMENTE ATACADO POR UN DEMONIO " + "HAZ PERDIDO LA MITAD DE TUS PUNTOS DE VIDA\n");
                        System.out.println("TUS PUNTOS DE VIDA SON: " + puntos);
                    }


                    if (envenenado != 0) {
                        puntos -= 2;
                        System.out.println("El veneno hace efecto. -2 vida. Vida actual: " + puntos);
                    }
            }
            if (puntos <=0) {
                System.out.println("*** !OH NO¡ HAZ PERDIDO TODOS TUS PUNTOS DE VIDA ***\n");
                System.out.println("************** FIN DEL JUEGO **************\n");
            }  else if (experiencia >=50){
                System.out.println("*** FELICIDADES ***\n");
                System.out.println("***** HAZ LOGRADO SALIR CON EXITO DE LA DIMENCION MAGICA *****\n");
            }
        }
    }
}