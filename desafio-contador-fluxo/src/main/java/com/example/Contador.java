package com.example;

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número 1:");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o número 2:");
        int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoException e) {

            
            System.out.println("O segundo parâmetro deve ser MAIOR que o primeiro.");
            
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException {

        if (parametroUm > parametroDois) {
            throw new ParametroInvalidoException();
        } 
            
        int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Contando: " + i);
            }
        
    }
}
