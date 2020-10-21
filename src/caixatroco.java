import java.util.Scanner;

public class caixatroco {
	
	public static void main (String args[]) {
		
		 Scanner ler = new Scanner(System.in);
	        double produto, troco, pago;
	        
	        System.out.printf("Informe o Valor do produto: ");
	        produto = ler.nextDouble();
	        
	        System.out.printf("Informe o Valor do pagamento: ");
	        pago = ler.nextDouble();
	        
	        troco=(pago-produto);
	        
	        while (troco < 0) {
	            System.out.println("!!ACEITO APENAS PAGAMENTO ACIMA OU IGUAL AO VALOR DO PRODUTO!!");
	            System.out.printf("Informe o Valor do produto: ");
	            produto = ler.nextDouble();
	            
	            System.out.printf("Informe o Valor do pagamento: ");
	            pago = ler.nextDouble();
	            
	            troco=(pago-produto);
	        
	        }
	        if (troco == 0) {
	            System.out.println("Fim da transação. Não há troco");
	        } else {
	            System.out.println("Fim da transação. Seu troco: R$"+troco);
	        }
	    
	}

}
