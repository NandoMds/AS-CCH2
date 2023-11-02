package Plataforma;

import Aplicativo.Aplicativo;

public class IOS implements Plataforma{

	@Override
	public String getVersaoApp(Aplicativo app) {
		return app.getFuncionalidades();
	}
}
