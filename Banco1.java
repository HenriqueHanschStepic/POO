import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Banco
{
    public static void main(String[] args){
        
         Scanner entrada = new Scanner(System.in);

         ContaCliente conta1 = new ContaCliente("2569",100.00,56.00,30.00,50);
         
            System.out.printf("%n Infromacoes da conta:%s%n",
                conta1.getNumeroConta());

            System.out.printf(" Saldo do inicio do mes : %s%n ",
                conta1.getSaldoInicioMes());

            System.out.printf("Gasto total no mes: %s%n ",
                conta1.getGastoMes());

            System.out.printf("Seu credito aplicado : %s%n ",
                conta1.getCreditoAplicado());

            System.out.printf("Seu limite de credito  : %s%n ",
                conta1.getLimiteCredito());

            try {    
                System.out.printf("Seu limite de credito  : %s%n ",
                conta1.limite()); 
            } catch( LimitExcedido excecao)    
                {
                     System.out.println(excecao.getMessage());
                     
                }
                
    }    
}
