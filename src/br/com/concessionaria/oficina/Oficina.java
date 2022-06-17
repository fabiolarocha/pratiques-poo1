package br.com.concessionaria.oficina;

import java.util.ArrayList;

import br.com.concessionaria.estrutura.Peca;
import br.com.concessionaria.funcionarios.Mecanico;
import br.com.concessionaria.veiculos.Veiculo;

public class Oficina {

	private String nome;
	private ArrayList<Mecanico> listaMecanicos;
	private ArrayList<Peca> listaPecas;
	private ArrayList<Veiculo> listaVeiculos;
	private int pecasNecessarias;
	
	public Oficina(String nome) {
		super();
		this.nome = nome;
		listaMecanicos = new ArrayList<Mecanico>();
		listaPecas = new ArrayList<Peca>();
		listaVeiculos = new ArrayList<Veiculo>();
	}

	public void adicionarMecanico(Mecanico mecanico) {
		this.getListaMecanicos().add(mecanico);
		System.out.println("Mecânico foi adicionado!");
	}
	
	public void removerMecanico(Mecanico mecanico) {
		
	}
	
	public void adicionarPeca(Peca peca) {
		this.getListaPecas().add(peca);
		System.out.println("Peça foi adicionada!");
	}

	public void removerPeca(Peca peca) {
		
	}
	
	public void adicionarVeiculo(Veiculo veiculo) {
		this.getListaVeiculos().add(veiculo);
		System.out.println("Veículo foi adicionado!");
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		
	}
	
	public int verificarPecasRevisao() {
		int numeroPecasUsadas = 0;
		return numeroPecasUsadas;
	}
	
	public boolean realizarRevisaoVeiculos() {
		return true;
	}
	
	public float valorTotalPecas() {
		float somaValorTotalPecasOficina = 0;
		return somaValorTotalPecasOficina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Mecanico> getListaMecanicos() {
		return listaMecanicos;
	}

	public void setListaMecanicos(ArrayList<Mecanico> listaMecanicos) {
		this.listaMecanicos = listaMecanicos;
	}

	public ArrayList<Peca> getListaPecas() {
		return listaPecas;
	}

	public void setListaPecas(ArrayList<Peca> listaPecas) {
		this.listaPecas = listaPecas;
	}

	public ArrayList<Veiculo> getListaVeiculos() {
		return listaVeiculos;
	}

	public void setListaVeiculos(ArrayList<Veiculo> listaVeiculos) {
		this.listaVeiculos = listaVeiculos;
	}

	public int getPecasNecessarias() {
		return pecasNecessarias;
	}

	public void setPecasNecessarias(int pecasNecessarias) {
		this.pecasNecessarias = pecasNecessarias;
	}
	
	
	
}
	
