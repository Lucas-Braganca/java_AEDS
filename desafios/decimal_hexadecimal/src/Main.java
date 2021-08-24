import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main{
//Entrar com N números (decimais ou hexadecimais) e realizar a conversão. Um número decimal deve ser convertido para
//hexadecimal, e vice versa. Ao digitar -1 o programa deverá ser encerrado.
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String entry = "";
        do{
            entry = reader.next();
            switch (entry) {
                case "-1":
                    break;
                default:
                    if(entry.length() >2 && entry.charAt(1) == 'x'){
                        String substring = entry.substring(2);
                        int result2 = Integer.parseInt(substring,16);
                        System.out.println(result2);
                    } else {
                        int convertido = Integer.valueOf(entry);
                        String result = Integer.toHexString(convertido);
                        System.out.println("0x"+result.toUpperCase(Locale.ROOT));
                    }
            }
        }while(!entry.equals("-1"));
    }

}