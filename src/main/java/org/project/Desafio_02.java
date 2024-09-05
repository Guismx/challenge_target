//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de
// informar a quantidade de vezes em que ela ocorre.
//
//IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

package org.project;

import java.util.Scanner;

public class Desafio_02 {
    public static void main(String[] args) {
        //Scanner para solicitar input do texto
        Scanner scan = new Scanner(System.in);
        //Variáveis para o texto e o contador de quantas vezes aparecerá a letra
        String texto;
        int contador = 0;

        //Solicitação do input
        System.out.println("Digite a palavra: ");
        //Para pegar o input fornecido
        texto = scan.nextLine();

        //Transformar o texto somente para letras minúsculas, independente da escrita utilizada
        texto = texto.toLowerCase();
        //for para fazer a contagem de quantas vezes a letra 'a' aparece
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }
        //Validador se possui ou não a letra no texto
        if (contador > 0) {
            System.out.println("A letra 'a' (tanto maiúscula quanto minúscula) ocorre " + contador + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
    }
}
