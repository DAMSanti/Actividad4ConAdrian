/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fechas.stringbui;

/**
 *
 * @author DAM104
 */
public class Stringbui {

    public static void main(String[] args) {
        String cadena = "";
        int cont = 0;
        for (long i = 0; i < 100000000000L; i++) {
            cadena.concat("AAAAA");
            cont++;
            System.out.println(cont);
        }
    }
}
