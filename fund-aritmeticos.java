// DESAFIO 01: QUANTIDADE DE NÚMEROS POSITIVOS

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    float num1 = leitor.nextFloat();
	    float num2 = leitor.nextFloat();
	    float num3 = leitor.nextFloat();
	    float num4 = leitor.nextFloat();
	    float num5 = leitor.nextFloat();
	    float num6 = leitor.nextFloat();
	    int contador = 0;
    
    /* AQUI ERA SÓ FAZER
    UM LAÇO DE REPETIÇÃO */
	    
	    if(num1 > 0){
	        contador++;
	    }
	    
	    if(num2 > 0){
	        contador++;
	    }
	    
	    if(num3 > 0){
	        contador++;
	    }
	    
	    if(num4 > 0) {
	        contador++;
	    }
	    
	    if(num5 > 0){
	        contador++;
	    }
	    
	    if(num6 > 0){
	        contador++;
	    }
	    System.out.println(contador + " valores positivos");
	    
	}
}

// DESAFIO 02: EXIBINDO NÚMEROS PARES

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    int numero = leitor.nextInt();
		  for(int i = 1; i <= numero; i++){
		    if(i % 2 == 0){
		        System.out.println(i);
		    }
		}
		
	}
}

// DESAFIO 03: ANÁLISE DE NÚMEROS

import java.util.Scanner;

public class DesafiosDIO {

    
    public static void main(String[] args) {
        
        int numerosPares = 0;
        int numerosImpares = 0;
	      int numerosPositivos = 0;
	      int numerosNegativos = 0;
	      Scanner leitor = new Scanner(System.in);
        float num1 = leitor.nextFloat();
	      float num2 = leitor.nextFloat();
	      float num3 = leitor.nextFloat();
	      float num4 = leitor.nextFloat();
        float num5 = leitor.nextFloat();
      
      /* AQUI NOVAMENTE ERA SÓ
      FAZER UM LAÇO DE REPETIÇÃO */
		
	      if(num1 % 2 == 0){
          numerosPares++;
		    
	      }else{
          numerosImpares++;
	      }
		
	      if(num1 > 0){
	        numerosPositivos++;
	      }else if (num1 < 0){
	        numerosNegativos++;
	      }
		
	      if(num2 % 2 == 0){
          numerosPares++;
		    
	      }else{
	        numerosImpares++;
        }
		
	      if(num2 > 0){
          numerosPositivos++;
	      }else if (num2 < 0){
          numerosNegativos++;
	      }
		
	      if(num3 % 2 == 0){
          numerosPares++;
		    
	      }else{
	        numerosImpares++;
	      }
		
	      if(num3 > 0){
          numerosPositivos++;
	      }else if (num3 < 0){
          numerosNegativos++;
	      }
		
	      if(num4 % 2 == 0){
          numerosPares++;
	      }else{
          numerosImpares++;
	      }
		
	      if(num4 > 0){
          numerosPositivos++;
	      }else if (num4 < 0){
	        numerosNegativos++;
	      }
		
	      if(num5 % 2 == 0){
	        numerosPares++;
		    
	      }else{
	        numerosImpares++;
	      }
		
      	if(num5 > 0){
	        numerosPositivos++;
	     }else if (num1 < 0){
	        numerosNegativos++;
	     }
        System.out.println(numerosPares + " valor(es) par(es)");
        System.out.println(numerosImpares + " valor(es) impar(es)");
        System.out.println(numerosPositivos + " valor(es) positivo(s)");
        System.out.println(numerosNegativos + " valor(es) negativo(s)");
		
	}
}

// DESAFIO 04: CONTAGEM DE CÉDULAS

import java.io.IOException;
import java.util.Scanner;

public class Desafio{
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
      
        int notasInseridas = leitor.nextInt();
        int atual = notasInseridas;
        int notas100 = atual / 100;
        atual -= notas100 * 100;
        int notas50 = atual / 50;
        atual -= notas50 *50;
        int notas20 = atual / 20 ;
        atual -= notas20 * 20  ;
        int notas10 = atual / 10  ;
        atual -= notas10 * 10   ;
        int notas5 = atual / 5 ;
        atual -= notas5 * 5 ;
        int notas2 = atual / 2;
        atual -= notas2 * 2 ;
        int notas1 = atual;
    
        System.out.println(notasInseridas);
        System.out.println(  notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10  + " nota(s) de R$ 10,00");
        System.out.println(notas5  + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1  + " nota(s) de R$ 1,00");
    }
	
}

// DESAFIO 05: CONSUMO MÉDIO DO AUTOMÓVEL

import java.io.IOException;
import java.util.Scanner;

public class Desafio {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int distancia = leitor.nextInt();
        double combustivel  = leitor.nextDouble();

        double media = distancia / combustivel ;
        System.out.println(String.format("%.3f km/l",media));   
    }
	
}
