package Negocio;

import javax.swing.JOptionPane;

import Modelagem.Computador;

public class Pilha {

	
	    private Computador[] itens;
	    private int topo;

	    public Pilha(int capacidade) {
	        itens = new Computador[capacidade];
	        topo = -1;
	    }

	    public void empilhar(Computador item) {
	        if (topo < itens.length - 1) {
	            topo++;
	            itens[topo] = item;
	        } else {
	            JOptionPane.showMessageDialog(null, "Pilha cheia!");
	        }
	    }

	    public Computador desempilhar() {
	        if (topo >= 0) {
	            Computador item = itens[topo];
	            topo--;
	            return item;
	        } else {
	            JOptionPane.showMessageDialog(null, "Pilha vazia!");
	            return null;
	        }
	    }
	}