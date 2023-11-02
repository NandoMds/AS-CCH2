package Plataforma;

import Aplicativo.Aplicativo;

public class Android implements Plataforma{

	@Override
	public String getVersaoApp(Aplicativo app) {
		return app.getFuncionalidades();
	}
}