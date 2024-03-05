package uninter;

import java.util.Scanner;

public class cofrinhomenu {
	
	private Scanner sc;
	private cofrinho1 cofrinho;
	
	public cofrinhomenu() {
		sc = new Scanner(System.in);
        cofrinho = new cofrinho1();
	}
	
	public void exibirCofrinhomenuPrincipal(){
        System.out.println("COFRINHO");
        System.out.println("1-Adicionar moedas");
        System.out.println("2-Remover:");
        System.out.println("3-Listar moedas:");
        System.out.println("4-Calcular valor total convertido para real:");
        System.out.println("0-Encerrar:");
        
        String opcaoSelecionada = sc.next();
        
        switch (opcaoSelecionada) {
            
            case "0":
            	System.out.println("Operacao encerrado");
                break;
                
            case "1":
            	exibirSubMenuAdicionarMoedas();
            	exibirCofrinhomenuPrincipal();
            	break;
            	
            case "2":
            	exibirSubMenuRemoverMoedas();
            	exibirCofrinhomenuPrincipal();
            	break;
            	
            case "3":
            	cofrinho.listagemMoedas();
            	exibirCofrinhomenuPrincipal();
            	break;
            	
            case "4":
            	double valorTotalConvertido = cofrinho.totalConvertido();
            	System.out.println("Valor total convertido para real ? " + valorTotalConvertido);
            	exibirCofrinhomenuPrincipal();
            	break;
            	
            default:
            	System.out.println("Opcao invalida!");
            	exibirCofrinhomenuPrincipal();
            	break;
        }
  }	
	
	
	private void exibirSubMenuAdicionarMoedas() {
		System.out.println("Escolher Moeda:");
    	System.out.println("1 - REAL:");
    	System.out.println("2 - DOLAR:");
    	System.out.println("3 - EURO:");
    	
    	int opcaoMoeda = sc.nextInt();
    	
    	System.out.println("Digite o valor:");
    	
    	String valorTextualMoeda = sc.next();
    	valorTextualMoeda = valorTextualMoeda.replace(",", ".");
    	double valorMoeda = Double.valueOf(valorTextualMoeda);
    	
    	
    	Moeda moeda = null;
    	
    	if (opcaoMoeda == 1){
    		moeda = new Real(valorMoeda);
    	} else if (opcaoMoeda == 2) {
    		moeda = new Dolar(valorMoeda);
    	} else if (opcaoMoeda == 3){
            moeda = new Euro(valorMoeda);
    	} else {
    		System.out.println("Nao exixte essa moeda");
    		exibirCofrinhomenuPrincipal();
    	}
    	cofrinho.adicionar(moeda);
    	System.out.println("Moeda adicionada");
	}
	private void exibirSubMenuRemoverMoedas() {
		System.out.println("Escolher Moeda:");
    	System.out.println("1 - REAL:");
    	System.out.println("2 - DOLAR:");
    	System.out.println("3 - EURO:");
    	
    	int opcaoMoeda = sc.nextInt();
    	
    	System.out.println("Digite o valor:");
    	
    	String valorTextualMoeda = sc.next();
    	valorTextualMoeda = valorTextualMoeda.replace(",", ".");
    	double valorMoeda = Double.valueOf(valorTextualMoeda);
    	
    	
    	Moeda moeda = null;
    	
    	if (opcaoMoeda == 1){
    		moeda = new Real(valorMoeda);
    	} else if (opcaoMoeda == 2) {
    		moeda = new Dolar(valorMoeda);
    	} else if (opcaoMoeda == 3){
            moeda = new Euro(valorMoeda);
    	} else {
    		System.out.println("Nao exixte essa moeda");
    		exibirCofrinhomenuPrincipal();
    	}
    	
    	cofrinho.remover(moeda);    	
	}
	
}