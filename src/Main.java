// O programa recebe uma palavra do usuário e a retorna criptografada de acordo com a Cifra de César.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String continuar = "";
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite uma palavra:");
            String palavra = entrada.nextLine().toLowerCase();
            criptografiaAscii(palavra);
            System.out.println("Deseja criptografar outra palavra? (S/N)");
            continuar = entrada.nextLine().toLowerCase(Locale.ROOT);
        }
        while(!Objects.equals(continuar, "n"));
    }

    public static void criptografiaAscii(String palavra){
        char[] cifra = new char[palavra.length()];
        for(int i = 0; i < palavra.length(); i++){
            int letraOriginal = palavra.charAt(i);
            if (letraOriginal >= 120){
                letraOriginal = letraOriginal - 26;
            }
            char letraNova = (char) (letraOriginal + 3);
            cifra[i] = letraNova;
        }
        String output = "";
        for (char c : cifra) {
            output = output + c;
        }
        System.out.println("Sua palavra criptografada é: "+ output);

    }

}
