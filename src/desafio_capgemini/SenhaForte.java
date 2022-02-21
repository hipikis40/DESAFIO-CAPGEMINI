package desafio_capgemini;

/**
 *
 * @author omega
 */
public class SenhaForte {
    public static int senhaForte(String palavra){
        String c = "";
        String minusc = "";
        String maiusc = "";
        int numero;
        if(charEspecial(palavra)== false){
            c = "&";
        }if(letraMin(palavra) == false){
        minusc = "z";
        }if(letraMai(palavra) == false){
        maiusc = "M";
        }if(numero(palavra) == false){
            numero = 8;
        }
            if(palavra.length() < 6){
                System.out.println("Tamanho mínimo de 6 caracteres.");
                return 6 - palavra.length();
            }
            return 0;
        }
    public static boolean charEspecial(String charr){
       // System.out.println(" Caractere Especial " + charr.matches(".*[!@#$%^&*()-+].*"));
        return charr.matches(".*[!@#$%^&*()-+].*");
    }
    public static boolean letraMin(String charr){
      //  System.out.println(" Letra minúsculo " + charr.matches(".*[a-zA-Z].*"));
        return charr.matches(".*[a-z].*");
    }
    public static boolean letraMai(String charr){
      //  System.out.println(" Letra maiuscula " + charr.matches(".*[a-zA-Z].*"));
        return charr.matches(".*[A-Z].*");
    }
    public static boolean numero(String charr){
       // System.out.println(" Numero " + charr.matches(".*[0-9].*"));
        return charr.matches(".*[0-9].*");
    }
}
