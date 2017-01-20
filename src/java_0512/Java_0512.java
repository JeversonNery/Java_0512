
package java_0512;

import java.util.Random;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int num_sorte;
        num_sorte = (65 + aleatorio.nextInt(90-65));
        char caractere = (char)num_sorte;
        
        System.out.println("Número sorteado: " + num_sorte);
        System.out.println("Caractere correspondente: " + caractere);
        
        
    }
    
}
