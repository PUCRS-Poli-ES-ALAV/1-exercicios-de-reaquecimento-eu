public class Main {

    public static void main (String[] args){
        int a = 3;
        int b = 2;
        int n = 4;
        int h = 6;
        String palavra = "AMAFAGAFOS";

        int resultado = multiplicar(a, b);
        int resultado2 = soma(a,b);
        double resultado3 = fracao(n);
        String resultado4 = reverse(palavra);


        System.out.println(a + "*" + b + "=" + resultado);
        System.out.println(a + "+" + b + "=" + resultado2);
        System.out.println("1 + 1/2 + 1/3 + ... + 1/" + n + " = " + resultado3);
        System.out.println("Original: " + palavra);
        System.out.println("Invertida: " + resultado4);
        for (int i = 1; i <= h; i++) {
            System.out.println("F(" + i + ") = " + gerador(i));
        }


    }


    // MULTIPLICACAO ATRAVES DE SOMAS SUCESSIVAS
    public static int multiplicar(int a, int b){
        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b-1);
    }

    // SOMA ATRAVES DE INCREMENTOS
    public static int soma(int a, int b){
        if (b == 0) {
            return a;
        }
        return soma(a+1, b-1);
    }

    // CALCULO DE FRACOES
    public static double fracao(int n){
        if (n==1) {
            return 1.0;
        }
        return (1.0/n) + fracao (n-1);
    }

    // INVERSAO DE STRING
    public static String reverse(String s){
        if (s.length() <= 1){
            return s;
        }
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }

    // GERADOR 1
    public static int gerador(int h){
        if (h == 1){
            return 1;
        }
        if (h == 2){
            return 2;
        }
        return 2 * gerador(h-1) + 3 * gerador(h-2);
    }

}
