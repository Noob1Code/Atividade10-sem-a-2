/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package Aula10Completa;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 15/03/2024
 * @brief Class Teste
 */

import java.util.*;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String color;
        double lado1, lado2, raioDoCirculo = 0, alturaDoTriangulo = 0, baseDoTriangulo = 0;
        int opcao = 0;
        boolean test = true;    
        
        
        do {
            
           System.out.println("Escolha uma Figura geométrica: \n"
                    + "1  ­Triângulo; \n"
                    + "2 ­ Retângulo; \n"
                    + "3 ­ Quadrado; \n"
                    + "4 ­ Circulo; \n"
                    + "5 ­ sair;");
            opcao = ler.nextInt(); 
            
        switch (opcao) {
            case 1:
                if (opcao == 1) {
                System.out.println("Informe a base do triângulo: ");
                baseDoTriangulo = ler.nextDouble();

                System.out.println("Informe a altura do triângulo: ");
                alturaDoTriangulo = ler.nextDouble();

                System.out.println("Informe a cor do triângulo: ");
                color = ler.next();

                Triangulo triangulo = new Triangulo(color, baseDoTriangulo, alturaDoTriangulo);
                System.out.println(triangulo);
                break;
                }
                
            case 2:
                if (opcao == 2) {
                System.out.println("Informe o lado1 do retângulo: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe o lado2 do retângulo: ");
                lado2 = ler.nextDouble();

                System.out.println("Informe a cor do retângulo: ");
                color = ler.next();

                Retangulo retangulo = new Retangulo(color, lado1, lado2);
                System.out.println(retangulo);
                break;
                }
                
            case 3:
                if (opcao == 3) {
                System.out.println("Informe o lado do quadrado: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe a cor do quadrado: ");
                color = ler.next();

                lado2 = lado1;

                Quadrado quadrado = new Quadrado(color, lado1, lado2);
                System.out.println(quadrado);
                break;
                }
            case 4:
                if (opcao == 4) {
                System.out.println("Informe o raio do círculo: ");
                raioDoCirculo = ler.nextDouble();

                System.out.println("Informe a cor do círculo: ");
                color = ler.next();

                 Circulo circulo = new Circulo(color, raioDoCirculo);
                 System.out.println(circulo);
                 break;
                }
            case 5:
                if (opcao == 5) {
                test = false;
            }
            if (opcao < 0 || opcao > 5){
                System.out.println("Opção invalida");
            }
        }
        }while (test == true);
    }
        
}
