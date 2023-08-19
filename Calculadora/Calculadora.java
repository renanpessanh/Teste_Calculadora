import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opc = 1;
        while (opc != 0){
      
                System.out.println("______CALCULADORA_______");
                System.out.println("------------------------");
                System.out.println("---------MENU-----------");
                System.out.println("");
                System.out.println(" 1- Soma");
                System.out.println(" 2- Subtração");
                System.out.println(" 3- Multiplicação");
                System.out.println(" 4- Divisão");
                System.out.println(" 0- Sair");
                System.out.println("");
                System.out.println("Escolha uma opção acima!");
                System.out.println("");
                System.out.println("------------------------");
                System.out.println("-Opção:                -");
            
            Scanner escolha = new Scanner(System.in);
            
            int opcao = escolha.nextInt();
            if(opcao == 0){
            opc = 0;
            }
            
            if(opcao != 0){
                System.out.println("------------------------");
                System.out.println("- 1º Número:           -");
                    Scanner v1 = new Scanner(System.in);
                        double valor1 = v1.nextDouble();
                        
                System.out.println("------------------------");
                System.out.println("- 2º Número:           -");       
                    Scanner v2 = new Scanner(System.in);
                        double valor2 = v2.nextDouble();
                System.out.println("-------RESULTADO--------");
            
            if(opcao == 1){
                        double soma = (valor1 + valor2);
                System.out.println("A soma é " + soma);     
                System.out.println("");
                System.out.println("");
            }
            
            if(opcao == 2){
                        double sub = (valor1 - valor2);
                System.out.println("A subtração é " + sub);
                System.out.println("");
                System.out.println("");
            }
            
            if(opcao == 3){
                        double mult = (valor1 * valor2);
                System.out.println("A multiplicação é " + mult);  
                System.out.println("");
                System.out.println("");
            }
            
            if(opcao == 4){
                        double div = (valor1 / valor2);
            
            if(valor2 == 0){
                System.out.println("ERRO");
                System.out.println("");
                System.out.println("");
            }
            else {
                System.out.println("A divisão é " + div);
                System.out.println("");
                System.out.println("");
                        }
                    }
                }
            }            
        System.out.println("Você fechou o programa");  
    }  
}     