package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion a, b;

		System.out.println("Digite os dados do primeiro campeão: ");

		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Vida inicial: ");
		int life = sc.nextInt();

		System.out.print("Ataque: ");
		int attack = sc.nextInt();

		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		a = new Champion(name, life, attack, armor);

		System.out.println();

		System.out.println("Digite os dados do segundo campeão: ");

		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.print("Vida inicial: ");
		life = sc.nextInt();

		System.out.print("Ataque: ");
		attack = sc.nextInt();

		System.out.print("Armadura: ");
		armor = sc.nextInt();

		b = new Champion(name, life, attack, armor);

		System.out.println();

		System.out.print("Quantos turnos você deseja executar? ");
		int turnos = sc.nextInt();

		int x = 0;

		while (x < turnos && a.getLife() != 0 && b.getLife() != 0) {
			x++;

			a.takeDamage(b);
			b.takeDamage(a);

			System.out.println();
			System.out.println("Resultado do turno " + x + ": ");

			System.out.println(a.status());
			System.out.println(b.status());

		}

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
