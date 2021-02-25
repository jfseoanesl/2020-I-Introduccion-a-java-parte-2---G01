/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava_g01;

/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirMsg("Java");
        dividir(5,2);
    }
    
    /**
    @param txt texto que se muestra por consola
    @version version de prueba del metodo
    */
    public static void imprimirMsg(String txt){
        System.out.print("Bievenidos a ");
        System.out.println(txt);
        System.out.printf("Soy %s el docente y tengo %d años\n", "Jairo", 20);
    }
    
    public static void dividir(int a, int b){
        System.out.printf("Resultado de %d / %d = %.2f",a,b, (double)a/b );
    }
    
}
