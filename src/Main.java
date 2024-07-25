// O programa recebe uma palavra do usuário e a retorna criptografada de acordo com a Cifra de César.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String continuar = "";
        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite uma palavra:");
            String palavra = entrada.nextLine().toLowerCase();
            criptografia(palavra);
            System.out.println("Deseja criptografar outra palavra? (S/N)");
            continuar = entrada.nextLine().toLowerCase(Locale.ROOT);
        }
        while(!Objects.equals(continuar, "n"));
    }

    public static void criptografia(String palavra){
        ArrayList<Character> alfabeto = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        char[] cifra = new char[palavra.length()];

        for(int i = 0; i < palavra.length(); i++){
            char letraOriginal = palavra.charAt(i);
            int indexOriginal = alfabeto.indexOf(letraOriginal);
            int indexCriptografado = indexOriginal + 3;
            if (indexCriptografado >= 26){
                indexCriptografado = indexCriptografado - 26;
            }
            char letraCriptografada = alfabeto.get(indexCriptografado);
            cifra[i] = letraCriptografada;
        }
        String output = "";
        for (char c : cifra) {
            output = output + c;
        }
        System.out.println("Sua palavra criptografada é: "+ output);
    }
}
