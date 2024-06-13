package smarthone.iphone;

import smarthone.aparelhotelefonico.Smartphone;
import smarthone.navegadorInternet.NavegadorInternet;
import smarthone.reprodutormusical.reprodutorMusical;

public class Iphone  implements Smartphone , NavegadorInternet, reprodutorMusical {

	@Override
	public void exibirPagina() {
		System.out.println("exibindo pagina");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando pagina");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		System.out.println("ligando");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender() {
		System.out.println("atendendo");
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inicarCorreioVoz() {
		System.out.println("inicinado correio de voz");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tocarMusica() {
		System.out.println("tocando musica");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("selecionando musica");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("pausando musica");
		// TODO Auto-generated method stub
		
	}
	
}
