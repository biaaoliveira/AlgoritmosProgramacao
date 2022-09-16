//Crie uma função com dois parâmetros numéricos capaz
//de verificar qual número é o maior e retorná lo.

package com.mycompany.programacaomodular;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = leitor.nextInt();
        int resultado;
        int maiorNumero =0;
   
        resultado =  maiorNumero(int num1,num2);
    }

    static int maiorNumero(int[] [] resultado) {
       int maiorNumero = 0;
       for(int i = 0 ; i < resultado.length ; i++){
             for(int j = 0 ; j < resultado.length ; j++){
                 if((i == 0) && (j == 0)){
                     maiorNumero = resultado[i][j];
                 }else{
                     if (maiorNumero<resultado[i][j]){
                         maiorNumero = resultado[i][j];
                     }
             }
       }
    }
       return maiorNumero;

    }
}
