import java.util.*;
class Primo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero pra checar se e primo ou nao: ");
        int number= sc.nextInt();
        if(ePrime(number)) {
            System.out.println(number + " e primo");
        }
        else{
            System.out.println(number + " nao e primo");
        }
    }
    static  boolean ePrimo(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }


}
