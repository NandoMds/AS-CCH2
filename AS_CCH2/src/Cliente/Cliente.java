package Cliente;

import Plataforma.*;
import Aplicativo.*;

public class Cliente {
	public static void main(String[] args) {
		Plataforma android = new Android();
		Plataforma ios = new IOS();
		
		Aplicativo mobile = new Mobile("Deslizar para a direita");
		Aplicativo web = new Web("Arrastar para a direita");
		
		System.out.println("No Android: " + android.getVersaoApp(mobile));
		System.out.println("No IOS: " + ios.getVersaoApp(web));
	}
}
