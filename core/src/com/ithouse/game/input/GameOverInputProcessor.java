package com.ithouse.game.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.ithouse.game.UnrealDefence;
import com.ithouse.game.entity.GameState;
import com.ithouse.game.screen.GameOverScreen;
import com.ithouse.game.td.GDSprite;

import java.util.List;

public class GameOverInputProcessor extends GDInputProcessor {
    List<GDSprite> buttons;
    private GameOverScreen gameOverScreen;

    public GameOverInputProcessor(UnrealDefence unrealDefence, GameOverScreen screen) {
        super(unrealDefence);
        this.gameOverScreen = screen;
    }

    @Override
    public boolean keyDown(int keycode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub

        buttons = gameOverScreen.getButtons();
        for (int i = 0; i < buttons.size(); i++) {
            GDSprite sprite = buttons.get(i);

            if (Gdx.input.isButtonPressed(Buttons.LEFT)) {
                if (sprite.contains(screenX, screenY)) {
                    switch (i) {
                        case GameOverScreen.RESTART:
                            GameState.getInstance().initialize();
                            unrealDefence.switchScreen(unrealDefence.getGameScreen());
                            break;
                        case GameOverScreen.MAIN_MENU:
                            unrealDefence.switchScreen(unrealDefence.getMainMenuScreen());
                            break;
                        case GameOverScreen.EXIT:
                            System.exit(1);
                            break;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        buttons = gameOverScreen.getButtons();
        for (int i = 0; i < buttons.size(); i++) {
            GDSprite sprite = buttons.get(i);
            if (screenX >= sprite.getX() && screenX < sprite.getX() + sprite.getWidth()
                    && screenY >= sprite.getY() && screenY < sprite.getY() + sprite.getHeight()) {

                buttons.get(i).setAlpha(0.8f);
            } else buttons.get(i).setAlpha(1);
        }
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        // TODO Auto-generated method stub
        return false;
    }
}
