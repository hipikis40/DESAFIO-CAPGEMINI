package desafio_capgemini;

import com.google.common.base.Strings;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author omega
 */
public class Desafio_Capgemini {

    public static void main(String[] args) {
        String aux;
        boolean soNumeros;
    do {//verificaçao para ver se tem somente numeros
        aux = JOptionPane.showInputDialog("Digite o número");
        soNumeros = true;
        if (!aux.matches("\\d+")) {
            soNumeros = false;
        }
    } while (!soNumeros);
    simbolosNumeros.Number(Integer.parseInt(aux));
    
    String senha = JOptionPane.showInputDialog("Digite o número");
    int valor = SenhaForte.senhaForte(senha);
    System.out.println("Faltam : " + valor + " caracteres.");

    }
    
}
