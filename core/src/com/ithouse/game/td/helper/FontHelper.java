package com.ithouse.game.td.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;


public class FontHelper {
	public static BitmapFont minecraftia14px = null;
	public static BitmapFont minecraftia12px = null;
	public static BitmapFont minecraftia8px = null;

	/**
	 * This method must be called once to register all fonts to be used.
	 */
	public static void initialize() {
		prepareMinecraftiaFont();
	}

	private static void prepareMinecraftiaFont() {
//		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("Minecraftia.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		BitmapFont myFont = new BitmapFont();
		myFont.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
		parameter.flip = true;
		
		// font size 14 pixels
		parameter.size = 14;
//		minecraftia14px = generator.generateFont(parameter);
		minecraftia14px = myFont;

		// font size 12 pixels
		parameter.size = 12;
		minecraftia12px = myFont;
		
		// font size 8 pixels
		parameter.size = 8;
		minecraftia8px = myFont;
		myFont.dispose(); // don't forget to dispose to avoid memory leaks!
	}
}
