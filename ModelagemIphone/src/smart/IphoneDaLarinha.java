package smart;
import smarthone.iphone.Iphone;

public class IphoneDaLarinha {
	public static void main(String[] args) {
		Iphone navegador = new Iphone();
		System.out.println("navegador de internet:");
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirPagina();
		
		Iphone reprodutor = new Iphone();
		System.out.println("reprodutor de msusicas:");
		reprodutor.tocarMusica();
		reprodutor.pausarMusica();
		reprodutor.selecionarMusica();
		
		Iphone phone = new Iphone();
		System.out.println("phone :");
		phone.atender();
		phone.inicarCorreioVoz();
		phone.ligar();
		
	}
}
