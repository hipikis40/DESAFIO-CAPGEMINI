package desafio_capgemini;

import com.google.common.base.Strings;

/**
 *
 * @author omega
 */
public class simbolosNumeros {
    public static void Number(int num){ 
        int h = 1;
        String ourString = " ";
        String other = "*";
        String Result = null;
        String finalResult = null;
        for(int count = num; count > 0; count--) {   
            finalResult = Strings.repeat(ourString, count);
            Result = Strings.repeat(other, h++);
            System.out.println(finalResult+Result);
        }
    }
}
