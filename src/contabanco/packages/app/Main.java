package contabanco.packages.app;

import java.io.*;
import java.util.Scanner;
import java.util.Locale;
import contabanco.packages.model.*;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt","BR"));
		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String clienteNome;
		double saldo;		
		System.out.print("Por favor, digite o número da conta bancária: ");
		numero = sc.nextInt();
		System.out.print("Por favor, digite o código da agência bancária: ");
		agencia = sc.next();
		sc.nextLine(); //Limpa o buffer
		System.out.print("Por favor, digite o nome do cliente: ");
		clienteNome = sc.nextLine();
		System.out.print("Por favor, digite o saldo da conta: ");
		saldo = sc.nextDouble();
		ContaTerminal conta = new ContaTerminal(numero, agencia, clienteNome,saldo);
		System.out.println();
		conta.exibirDetalhesConta();
		sc.close();
	}

}
