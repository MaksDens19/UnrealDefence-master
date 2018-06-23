package com.ithouse.game.entity;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class TextureFactory {
	private static HashMap<String, Texture> textures = new HashMap<String, Texture>();
	private static HashMap<String, Texture> projectiles = new HashMap<String, Texture>();
	
	public static Texture createTexture(String key){
		String path = "";
		key = key.toLowerCase();
		Texture texture = (Texture) textures.get(key);
		if (texture == null) {
			if (key.equals("spider")) {
				path = "spider.png";
//				path = "assets/img/spider.png";
			} else if (key.equals("grass")) {
				path = "grass.png";
//				path = "assets/img/grass.png";
			} else if (key.equals("dirt")) {
				path = "dirt_light.png";
//				path = "assets/img/dirt_light.png";
			} else if (key.equals("dirt_dark")) {
				path = "dirt_dark.png";
//				path = "assets/img/dirt_dark.png";
			} else if (key.equals("steve")) {
				path = "steve.png";
//				path = "assets/img/steve.png";
			} else if (key.equals("dirtdark")) {
				path = "dirt_dark.png";
//				path = "assets/img/dirt_dark.png";
			} else if (key.equals("highlight")) {
				path = "tile_highlight.png";
//				path = "assets/img/tile_highlight.png";
			} else if (key.equals("ui")) {
				path = "ui.png";
//				path = "assets/img/ui.png";
			} else if (key.equals("heart")) {
				path = "heart.png";
//				path = "assets/img/heart.png";
			} else if (key.equals("tower_label")) {
				path = "tower_label.png";
//				path = "assets/img/tower_label.png";
			} else if (key.equals("emerald")) {
				path = "emerald.png";
//				path = "assets/img/emerald.png";
			} else if (key.equals("wave")) {
				path = "wave.png";
//				path = "assets/img/wave.png";
			} else if (key.equals("red_highlight")) {
				path = "red_highlight.png";
//				path = "assets/img/red_highlight.png";
			} else if (key.equals("dirt_tower")) {
				path = "new_dirt_tower.png";
//				path = "assets/img/new_dirt_tower.png";
			} else if (key.equals("arrow_tower")) {
				path = "new_arrow_tower.png";
//				path = "assets/img/new_arrow_tower.png";
			} else if (key.equals("egg_tower")) {
				path = "new_egg_tower.png";
//				path = "assets/img/new_egg_tower.png";
			} else if (key.equals("potion_tower")) {
				path = "new_potion_tower.png";
//				path = "assets/img/new_potion_tower.png";
			} else if (key.equals("currency_tower")) {
				path = "new_currency_tower.png";
//				path = "assets/img/new_currency_tower.png";
			} else if (key.equals("tower_highlight")) {
				path = "ui_tower_highlight.png";
//				path = "assets/img/ui_tower_highlight.png";
			} else if (key.equals("info_bg")) {
				path = "info_bg.png";
//				path = "assets/img/info_bg.png";
			} else if (key.equals("upgrade_button")) {
				path = "upgrade_button.png";
//				path = "assets/img/upgrade_button.png";
			} else if (key.equals("sell_button")) {
				path = "sell_button.png";
//				path = "assets/img/sell_button.png";
			} else if (key.equals("upgrade_to_cegg")) {
				path = "upgrade_to_cegg.png";
//				path = "assets/img/upgrade_to_cegg.png";
			} else if (key.equals("upgrade_to_slime")) {
				path = "upgrade_to_slime.png";
//				path = "assets/img/upgrade_to_slime.png";
			} else if (key.equals("upgrade_to_wood")) {
				path = "upgrade_to_wood.png";
//				path = "assets/img/upgrade_to_wood.png";
			} else if (key.equals("upgrade_to_sand")) {
				path = "upgrade_to_sand.png";
//				path = "assets/img/upgrade_to_sand.png";
			} else if (key.equals("upgrade_to_firearrow")) {
				path = "upgrade_to_fireArrow.png";
//				path = "assets/img/upgrade_to_firearrow.png";
			} else if (key.equals("upgrade_to_icearrow")) {
				path = "upgrade_to_iceArrow.png";
//				path = "assets/img/upgrade_to_iceArrow.png";
			} else if (key.equals("main_background")) {
				path = "main_background.png";
//				path = "assets/img/main_background.png";
			} else if (key.equals("play_button")) {
				path = "play_button.png";
//				path = "assets/img/play_button.png";
			} else if (key.equals("settings_button")) {
				path = "settings_button.png";
//				path = "assets/img/settings_button.png";
			} else if (key.equals("about_button")) {
				path = "about_button.png";
//				path = "assets/img/about_button.png";
			} else if (key.equals("exit_button")) {
				path = "exit_button.png";
//				path = "assets/img/exit_button.png";
			} else if (key.equals("restart_button")) {
				path = "restart_button.png";
//				path = "assets/img/restart_button.png";
			} else if (key.equals("quit2menu_button")) {
				path = "quit2menu_button.png";
//				path = "assets/img/quit2menu_button.png";
			} else if (key.equals("back_to_menu_button")) {
				path = "back_to_menu_button.png";
//				path = "assets/img/back_to_menu_button.png";
			} else if (key.equals("resume_button")) {
				path = "resume_button.png";
//				path = "assets/img/resume_button.png";
			} else if (key.equals("gameover")) {
				path = "gameover.png";
//				path = "assets/img/gameover.png";
			} else if (key.equals("lvlselectbg")) {
				path = "lvlSelectBG.png";
//				path = "assets/img/lvlSelectBG.png";
			} else if (key.equals("map1")) {
				path = "map1.png";
//				path = "assets/img/map1.png";
			} else if (key.equals("map2")) {
				path = "map2.png";
//				path = "assets/img/map2.png";
			} else if (key.equals("map3")) {
				path = "map3.png";
//				path = "assets/img/map3.png";
			} else if (key.equals("title")) {
				path = "title.png";
//				path = "assets/img/title.png";
			} else if (key.equals("skeleton")) {
				path = "skeleton_spritesheet_reduced.png";
//				path = "assets/img/skeleton_spritesheet_reduced.png";
			} else if (key.equals("sand_tower")) {
				path = "sand_tower.png";
//				path = "assets/img/sand_tower.png";
			} else if (key.equals("wood_tower")) {
				path = "wood_tower.png";
//				path = "assets/img/wood_tower.png";
			} else {
				return null;
			}
			texture = new Texture(path);
			textures.put(key, texture);
		}
		return texture;
	}
	
	public static Texture createProjectile(String key) {
		String path = "";
		key.toLowerCase();
		Texture texture = (Texture) projectiles.get(key);
		if (texture == null) {
			if (key.equals("arrow")) {
				path = "projectile_arrow.png";
//				path = "assets/img/projectile_arrow.png";
			} else if (key.equals("cegg")) {
				path = "projectile_cegg.png";
//				path = "assets/img/projectile_cegg.png";
			} else if (key.equals("dirt")) {
				path = "projectile_dirt.png";
//				path = "assets/img/projectile_dirt.png";
			} else if (key.equals("egg")) {
				path = "projectile_egg.png";
//				path = "assets/img/projectile_egg.png";
			} else if (key.equals("fire_arrow")) {
				path = "projectile_fire_arrow.png";
//				path = "assets/img/projectile_fire_arrow.png";
			} else if (key.equals("ice_arrow")) {
				path = "projectile_ice_arrow.png";
//				path = "assets/img/projectile_ice_arrow.png";
			} else if (key.equals("potion")) {
				path = "projectile_potion.png";
//				path = "assets/img/projectile_potion.png";
			} else if (key.equals("sand")) {
				path = "projectile_sand.png";
//				path = "assets/img/projectile_sand.png";
			} else if (key.equals("wood")) {
				path = "projectile_wood.png";
//				path = "assets/img/projectile_wood.png";
			} else {
				return null;
			}
			texture = new Texture(path);
			projectiles.put(key, texture);
		}
		return texture;
	}
}
