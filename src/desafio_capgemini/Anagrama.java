package desafio_capgemini;

import javax.swing.JOptionPane;

/**
 *
 * @author omega
 */
public class Anagrama {
    
    public static int anagrama(String palavra){
        String str=palavra;
        if(palavra == null)
            System.out.println("Digite uma palavra: ");
        StringBuilder strb = new StringBuilder(str);
	str = strb.reverse().toString();
        
        char[] tempSting = palavra.toCharArray();
        
        System.out.println("Digite uma palavra: "+ palavra);
        System.out.println("Digite uma palavra: " + str);
        
        return 1;
    }
public static void main(String[] args) {
           
    anagrama("ifailuhkqq");
		
	}
}
