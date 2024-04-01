package Visao;

import javax.swing.JOptionPane;

import Modelagem.Computador;
import Negocio.Pilha;

public class InterfaceUsuario {

	public static void main(String[] args) {
	        Pilha pilha = new Pilha(3); // Tamanho máximo da pilha

	        while (true) {
	            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n1. Empilhar computador\n2. Desempilhar computador\n3. Sair");

	            switch (opcao) {
	                case "1":
	                    String marca = JOptionPane.showInputDialog("Marca do computador:");
	                    String modelo = JOptionPane.showInputDialog("Modelo do computador:");
	                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do computador:"));
	                    Computador comp = new Computador(marca, modelo, ano);
	                    pilha.empilhar(comp);
	                    JOptionPane.showMessageDialog(null, "Computador empilhado: " + comp);
	                    break;
	                case "2":
	                    Computador desempilhado = pilha.desempilhar();
	                    if (desempilhado != null) {
	                        JOptionPane.showMessageDialog(null, "Computador desempilhado: " + desempilhado);
	                    }
	                    break;
	                case "3":
	                    JOptionPane.showMessageDialog(null, "Saindo...");
	                    System.exit(0);
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opção inválida!");
	                    break;
	            }
	        }
	    }
	}