import java.util.Scanner;
public class primeiraLetra {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        String nome = "";
        String iniciais = "";


        System.out.print("Digite o nome: ");
        nome = input.nextLine().trim().toLowerCase();

        int comeco = 0;
        int fim = nome.indexOf(" ", comeco);

        while(fim != -1){
            String pedaco = nome.substring(comeco, fim);
            if (pedaco.equals("e") || pedaco.equals("do") || pedaco.equals("da") || pedaco.equals("dos") || pedaco.equals("das") || pedaco.equals("de") || pedaco.equals("di") || pedaco.equals("du")) {
                comeco = fim +1;
                fim = nome.indexOf(" ", comeco);
            }
            else {
                iniciais += nome.substring(comeco, comeco +1);
                comeco = fim +1;
                fim = nome.indexOf(" ", comeco);
            }
            if (fim == -1) {
                iniciais += nome.substring(comeco,comeco+1);
            }
        }
        System.out.println(iniciais.toUpperCase().trim());


    }
}
