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
			System.out.println("1. Pol�gono Quadrado \n"
					+ "2. Pol�gono Tri�ngulo \n"
					+ "3. Pol�gono Pent�gono regular\n"
					+ "4. Pol�gono Dec�gono regular\n"
					+ "9. Sair");

			option = in.nextInt();

			switch (option) {
				case 1: {
					System.out.println("Digite o valor do lado:");
					lado = in.nextDouble();
					resultado = lado * lado;
					System.out.println("A �rea do quadrado � igual a: " + resultado);
					break;
				}
				case 2: { //TRIANGULO ISOSCELES, EQUIL�TERO OU ESCALENO
					System.out.println("Digite o valor da base:");
					base = in.nextDouble();
					System.out.println("Digite o valor da altura:");
					altura = in.nextDouble();
					resultado = (base * altura)/2;
					System.out.println("A �rea do tri�ngulo � igual a: " + resultado);
					break;
				}
				case 3: {//PENTAGONO REGULAR
					System.out.println("Digite o valor da lado:");
					lado = in.nextDouble();
					System.out.println("Digite o valor da ap�tema:");
					altura = in.nextDouble();
					resultado = ((5 *lado) * altura)/2;
					System.out.println("A �rea do pent�gono regular � igual a: " + resultado);
					break;
				}
				case 4: {//DECAGONO REGULAR
					System.out.println("Digite o valor do lado:");
					lado = in.nextDouble();
					System.out.println("Digite o valor da ap�tema");
					altura = in.nextDouble();
					resultado = ((10* lado) * altura)/2;
					System.out.println("A �rea do dec�gono regular � igual a: " + resultado);
					break;
				}
				case 9:{
					System.out.println("At�!");
					inicialization = false;
					in.close();
					break;
				}
				default: {
					System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");
					break;
				}
			}

		}
	}
}
