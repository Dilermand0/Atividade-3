package Modelagem;

public class Computador {
	
	    private String modelo;
	    private int ano;
		private String marca;

	    public Computador(String marca, String modelo, int ano) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.ano = ano;
	    }

	    @Override
	    public String toString() {
	        return marca + " " + modelo + " (" + ano + ")";
	    }
	}