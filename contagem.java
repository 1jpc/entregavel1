// O valor de numeros inteiros entre 1 e um numero N é igual a N. Por esse motivo, fiz essa questão de acordo com minha interpretação, mostrando os numeros entre 1 e N.

import java.util.*;
public class Contagem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        qntNum = s.nextInt();
        int[] num = {};
        for(int i=1;i<qntNum;i++) {
            num.add(i);
        }
        System.out.println(num);
    }
}
