package br.edu.univas.main;

import java.util.Scanner;

public class Trabalho1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int option;
		boolean inicialization = true;
		
		double lado, base, altura;
		double resultado;
		while (inicialization == true) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. Polígono Quadrado \n"
					+ "2. Polígono Triângulo \n"
					+ "3. Polígono Pentágono regular\n"
					+ "4. Polígono Decágono regular\n"
					+ "9. Sair");

			option = in.nextInt();

			switch (option) {
				case 1: {
					System.out.println("Digite o valor do lado:");
					lado = in.nextDouble();
					resultado = lado * lado;
					System.out.println("A área do quadrado é igual a: " + resultado);
					break;
				}
				case 2: { //TRIANGULO ISOSCELES, EQUILÁTERO OU ESCALENO
					System.out.println("Digite o valor da base:");
					base = in.nextDouble();
					System.out.println("Digite o valor da altura:");
					altura = in.nextDouble();
					resultado = (base * altura)/2;
					System.out.println("A área do triângulo é igual a: " + resultado);
					break;
				}
				case 3: {//PENTAGONO REGULAR
					System.out.println("Digite o valor da lado:");
					lado = in.nextDouble();
					System.out.println("Digite o valor da apótema:");
					altura = in.nextDouble();
					resultado = ((5 *lado) * altura)/2;
					System.out.println("A área do pentágono regular é igual a: " + resultado);
					break;
				}
				case 4: {//DECAGONO REGULAR
					System.out.println("Digite o valor do lado:");
					lado = in.nextDouble();
					System.out.println("Digite o valor da apótema");
					altura = in.nextDouble();
					resultado = ((10* lado) * altura)/2;
					System.out.println("A área do decágono regular é igual a: " + resultado);
					break;
				}
				case 9:{
					System.out.println("Até!");
					inicialization = false;
					in.close();
					break;
				}
				default: {
					System.out.println("Opção inválida! Por favor, digite uma opção correta!");
					break;
				}
			}

		}
	}
}
