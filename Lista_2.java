package lista_2;

import java.util.Scanner;



public class Lista_2 {

    
    public static void main(String[] args) {
        
    // Gabriel de Almeida Araujo (RA: 822134612) e Henrique Mandri da Costa (RA: 822227761)
        
    //Letra C:
    
    /*
    int a, b;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com o primeiro número:");
    a = scan.nextInt();
        
    System.out.println("Entre com o segundo número:");
    b = scan.nextInt();
    
    if(a > b){
    System.out.println("O maior numero é o A: " +a);
    }
    else if(b > a){
    System.out.println("O maior numero é o B: " +b);
    }
    else{
    System.out.println("Os números sao iguais! ");
    }
    
    */           
    
    //Letra D:
    
    /*    
    double a, b;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Entre com o primeiro número:");
    a = scan.nextDouble();
        
    System.out.println("Entre com o segundo número:");
    b = scan.nextDouble();
    
    if(a > b){
    System.out.printf("O menor numero é o B: %.2f %n", (b));
    }
    else if(b > a){
    System.out.printf("O menor numero é o A: %.2f %n", (a));
    }
    else{
    System.out.printf("Os números sao iguais! ");
    }
    
    */
     
     //Letra N:
     
    /*
        int a;
        
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Digite a idade do nadador: ");
    a = scan.nextInt();
        
    
   
    if(a < 11 ){
    System.out.printf("O nadador está na categoria infantil ");
    }
    else if( a > 10 && a < 15){
    System.out.printf("O nadador está na categoria junior ");
    }
    else if( a > 14 && a < 21){
    System.out.printf("O nadador está na categoria adolescente ");
    }
    else if( a > 20 && a < 36){
    System.out.printf("O nadador está na categoria jovem ");
    }
    else{
    System.out.printf("O nadador está na categoria master ");
    }
     
    */ 
        
     //Letra K:
    /*
    int d1,m1,a1, d2,m2,a2;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Digite o dia da primeira data: ");
    d1 = scan.nextInt();
    System.out.println("Digite o mes da primeira data: ");
    m1 = scan.nextInt();
    System.out.println("Digite o ano da primeira data: ");
    a1 = scan.nextInt();
    
    System.out.println("Digite o dia da segunda data: ");
    d2 = scan.nextInt();
    System.out.println("Digite o mes da segunda data: ");
    m2 = scan.nextInt();
    System.out.println("Digite o ano da segunda data: ");
    a2 = scan.nextInt();
    
    if ( a1 > a2){
    
    System.out.println(" A data mais recente é: " +d1+"/"+m1+ "/"+a1 );
    
    }
    else if(a2 > a1){
    System.out.println(" A data mais recente é: " +d2+"/"+m2+ "/"+a2 );
    }
    
    else if(m2 > m1){
    System.out.println(" A data mais recente é: " +d2+"/"+m2+ "/"+a2 );
    }
    else if(m1 > m2){
    System.out.println(" A data mais recente é: " +d1+"/"+m1+ "/"+a1 );
    }
    else if(d2 > d1){
    System.out.println(" A data mais recente é: " +d2+"/"+m2+ "/"+a2 );
    }
    else if(d1 > d2){
    System.out.println(" A data mais recente é: " +d1+"/"+m1+ "/"+a1 );
    }
    */
    
    //Letra I:
    
    /*
    int d1,m1,a1, d2,m2,a2;
    String nome1, nome2;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Digite o nome da primeira pessoa: ");
    nome1 = scan.next();
    System.out.println("Digite o dia da primeira data: ");
    d1 = scan.nextInt();
    System.out.println("Digite o mes da primeira data: ");
    m1 = scan.nextInt();
    System.out.println("Digite o ano da primeira data: ");
    a1 = scan.nextInt();
    
    System.out.println("Digite o nome da segunda pessoa: ");
    nome2 = scan.next();    
    System.out.println("Digite o dia da segunda data: ");
    d2 = scan.nextInt();
    System.out.println("Digite o mes da segunda data: ");
    m2 = scan.nextInt();
    System.out.println("Digite o ano da segunda data: ");
    a2 = scan.nextInt();
    
    
    if ( a1 > a2){
    
    System.out.println("A pessoa mais velha é : " +nome2 );
    
    }
    else if(a2 > a1){
    System.out.println("A pessoa mais velha é : " +nome1 );
    }
    
    else if(m2 > m1){
    System.out.println("A pessoa mais velha é : " +nome1 );
    }
    else if(m1 > m2){
    System.out.println( "A pessoa mais velha é : " +nome2 );
    }
    else if(d2 > d1){
    System.out.println("A pessoa mais velha é : " +nome1 );
    }
    else if(d1 > d2){
    System.out.println("A pessoa mais velha é : " +nome2 );
    }
    */
    
    //Letra F:
    
    /*
    double n1, n2, n3;
    
    Scanner scan = new Scanner (System.in);
    
    
    System.out.println("Digite o primeiro numero: ");
    n1 = scan.nextDouble();
    System.out.println("Digite o segundo numero: ");
    n2 = scan.nextDouble();
    System.out.println("Digite o terceiro numero: ");
    n3 = scan.nextDouble();
    
    
    if ( n1 > n2 && n1 > n3 && n2 > n3){
    System.out.println(n1+ " > " +n2+ " > " +n3);
    }
    
    else if( n1 > n2 && n1 > n3 && n3 > n2){
    System.out.println(n1+ " > " +n3+ " > " +n2);
    }
    
    else if( n2 > n1 && n2 > n3 && n1 > n3){
    System.out.println(n2+ " > " +n1+ " > " +n3);
    }
    else if( n2 > n1 && n2 > n3 && n3 > n1){
    System.out.println(n2+ " > " +n3+ " > " +n1);
    }
    
    else if( n3 > n1 && n3 > n2 && n1 > n2){
    System.out.println(n3+ " > " +n1+ " > " +n2);
    }
    else if( n3 > n1 && n3 > n2 && n2 > n1){
    System.out.println(n3+ " > " +n2+ " > " +n1);
    }
    */
    
    //Letra: E
    
    int n1;
    
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Digite o numero: ");
    n1 = scan.nextInt();
    
    if(n1 %2 != 0 ){
        System.out.println("o numero "+n1+ " é impar");
    }
    
    else{
         System.out.println("o numero "+n1+ " é par");
    }
    
  }
}