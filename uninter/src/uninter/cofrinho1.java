package uninter;

import java.util.ArrayList;

public  class cofrinho1 {
	
	private ArrayList<Moeda> listaMoeda;
	
	public cofrinho1() {
		this.listaMoeda = new ArrayList<>();
	}
	
	public void adicionar(Moeda moeda){
		this.listaMoeda.add(moeda);
	}

	public void remover(Moeda moeda) {
		this.listaMoeda.remove(moeda);
		}
	
	public void listagemMoedas() {
		
		if (this.listaMoeda.isEmpty()) {
			System.out.println("Nao existe nenhuma moeda no cofrinho!");
			return;
		}
				 
		for (Moeda moeda : this.listaMoeda) {
			moeda.info();
		}	

	}

	public double totalConvertido() {
		
		if (this.listaMoeda.isEmpty()) {
		    return 0;
	    } 
		
        double valorAcumulado = 0;
        
        for (Moeda moeda : this.listaMoeda) {
            valorAcumulado = valorAcumulado + moeda.converter();
	    }
        
        return valorAcumulado;
	}
}
