package com.brentaureli.mariobros.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.brentaureli.mariobros.MarioBros;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		MarioBros marioBros = new MarioBros();
		config.width = marioBros.WIDTH;
		config.height = marioBros.HEIGHT;
		new LwjglApplication(new MarioBros(), config);
	}
}
