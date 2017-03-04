/*
 * Realiza un recorrido de 50 a 0 debe realizar el decremento de 2 en 2, 
 * si el número es divisible entre 3 muestrelo de los contrario no lo muestre.
 * Recuerde debe hacer uso de algun ciclo while o for. 
 * serie del 50 al 0: 50-48-46-44-42-40-38-36-34-32-30-28-26-24-22-20-18-16-14-12-10-8-6-4-2 
 * divisible entre 3: 48-42-36-30-24-18-12-6. 
 */
package recorridodecremental;

/**
 *
 * @author carlosjoseanguiano
 */
public class RecorridoDecremental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int k = 0;

        for (int i = 50; i > 0; i--) {
            //System.out.println("Resultado normal: " + i);
            k = i * 2;
            if (k <= 50) {
                //System.out.println("Valor multitplicacion " + k);

                if (k % 3 == 0) {
                    System.out.println("Resultado Divisible :" + k);
                }
            }
        }

    }

}
