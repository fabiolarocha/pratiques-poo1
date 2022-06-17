package br.com.concessionaria;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.oficina.Oficina;
import br.com.concessionaria.veiculos.Veiculo;

public class Main {

	public static void main(String[] args) {

		Oficina oficina = new Oficina("Oficina");
		
		Veiculo veiculo1 = new Veiculo("WMC001", 2015, 1, "MCW012", "CINZA", 500);
		Veiculo veiculo2 = new Veiculo("WMC021", 2017, 2, "MCW022", "PRETO", 1500);
		Veiculo veiculo3 = new Veiculo("WMC031", 2019, 3, "MCW033", "AZUL", 2500);
		
		oficina.adicionarVeiculo(veiculo1);
		oficina.adicionarVeiculo(veiculo2);
		oficina.adicionarVeiculo(veiculo3);

		Peca peca1 = new Peca("Bateria", 300, "10/02/2021");
		Peca peca2 = new Peca("Macaco", 200, "18/02/2021");
		Peca peca3 = new Peca("Manômetro", 500, "20/02/2021");
		Peca peca4 = new Peca("Chaves", 100, "10/03/2021");
		Peca peca5 = new Peca("Pneu", 500, "15/03/2021");
		Peca peca6 = new Peca("Alicate", 100, "18/03/2021");
		Peca peca7 = new Peca("Torquímetro", 300, "10/04/2021");
		Peca peca8 = new Peca("Amortecedor", 400, "11/05/2021");
		Peca peca9 = new Peca("Porta", 900, "22/06/2021");
		Peca peca10 = new Peca("Roda", 800, "30/09/2021");
		
		oficina.adicionarPeca(peca1);
		oficina.adicionarPeca(peca2);
		oficina.adicionarPeca(peca3);
		oficina.adicionarPeca(peca4);
		oficina.adicionarPeca(peca5);
		oficina.adicionarPeca(peca6);
		oficina.adicionarPeca(peca7);
		oficina.adicionarPeca(peca8);
		oficina.adicionarPeca(peca9);
		oficina.adicionarPeca(peca10);
		
		Mecanico mecanico1 = new Mecanico("João", 5, 2);
		Mecanico mecanico2 = new Mecanico("Pedro", 15, 8);
		Mecanico mecanico3 = new Mecanico("Antônio", 8, 4);
		
		oficina.adicionarMecanico(mecanico1);
		oficina.adicionarMecanico(mecanico2);
		oficina.adicionarMecanico(mecanico3);
	}

}
