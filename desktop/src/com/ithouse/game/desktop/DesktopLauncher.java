package com.ithouse.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.ithouse.game.UnrealDefence;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 680;
		config.height = 640;
		config.resizable = false;
		config.samples = 2;
		new LwjglApplication(new UnrealDefence(), config);
	}
}
