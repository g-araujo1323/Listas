
package copa;

import java.util.Scanner;

public class TesteJogadores {
    
    public static void main (String [] args) {
        
        Scanner leia = new Scanner (System.in);
        
        
        
        System.out.println("Nome do Jogador: ");
        String nome1 = leia.nextLine();
        System.out.println("Seleção: ");
        String selecao1 = leia.nextLine();
        System.out.println("Número da Camisa: ");
        int numero1 = leia.nextInt();
        
        System.out.println("Nome do Jogador: ");
        String nome2 = leia.next();
        System.out.println("Seleção: ");
        String selecao2 = leia.next();
        System.out.println("Número da Camisa: ");
        int numero2 = leia.nextInt(); 
        
        Jogadores jogador1 = new Jogadores(nome1,selecao1,numero1);
        Jogadores jogador2 = new Jogadores(nome2,selecao2,numero2);
        
        jogador1.exibirMensagem();
        jogador2.exibirMensagem();

        //perguntar quantos jogadores e deixar ele digitar quantos ele quiser
        
        while (nome !=){ 
        
        }
        
    }
    
}
