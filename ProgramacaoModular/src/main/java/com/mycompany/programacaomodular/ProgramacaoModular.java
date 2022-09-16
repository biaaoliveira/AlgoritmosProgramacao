package com.mycompany.programacaomodular;

import java.util.Scanner;

public class ProgramacaoModular {
    
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
            
       int [] DimensaoMatrizMain = new int [2];
       int linhaMain = lerValor("Digite a quantidade de linhas da matriz: ");
       int colunaMain = lerValor("Digite a quantidade de colunas da matriz:");
        
        int[][] matriz = new int [] ;
        
        for( int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length ; j++){
                matriz [i] [j] = i * j;
            }
        } 
        
        System.out.println(""); 
        
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                System.out.print(matriz1[j] + "");
            }
            System.out.println(""); 
        }
    }
    
    static int[] lerDimensaoMatriz(){
       int dimensaoLinha = lerValor("Digite a quantidade de linhas da matriz: ");
       int dimensaoColuna = lerValor("Digite a quantidade de colunas da matriz:");
       int [] vetorRetorno = new int[2];
       vetorRetorno[0] = dimensaoLinha;
       vetorRetorno[0] = dimensaoColuna;
       return vetorRetorno;
    }
    
    static int lerValor(String mansagemLeitura){
          System.out.println("Digite a quantidade de linhas: "); 
            int valor = sc.nextInt();
            return valor;
    }
            //variavel temporaria = so funciona quando esta dentro da função (podendo ter qualquer nome)
    }

