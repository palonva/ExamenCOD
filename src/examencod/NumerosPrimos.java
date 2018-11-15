package examencod; // cambio el package para que corresponda con el proyecto.

/**
 *
 * @author
 */
public class NumerosPrimos { // cambio el nombre del fichero para que corresponda con el de la clase.

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean booleanPrimo = false;

    public static void main(String arg[]) {
        int intNumDigitos = 0;
        int intNDigitos = 0;
        intNumDigitos = Integer.parseInt(arg[0]);
        if (intNumDigitos <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera = divisionEntera / 10;
                contador++;
            }
            intNDigitos = contador;

            if (intNDigitos == intNumDigitos) {
                if (i < 4) {
                    booleanPrimo = true;
                } else {
                    if (i % 2 == 0) {
                        booleanPrimo = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            booleanPrimo = true;
                        }
                    }
                }

                if (booleanPrimo == true) {
                    System.out.println(i);
                }
            }
        }
    }

}
