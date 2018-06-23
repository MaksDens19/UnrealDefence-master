package com.ithouse.game.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Buttons;
import com.ithouse.game.UnrealDefence;
import com.ithouse.game.entity.GameState;
import com.ithouse.game.screen.LvlSelectScreen;
import com.ithouse.game.td.GDSprite;

import java.util.List;

public class LvlSelectInputProcessor extends GDInputProcessor {
    List<GDSprite> buttons;
    private LvlSelectScreen lvlSelectScreen;

    public LvlSelectInputProcessor(UnrealDefence unrealDefence, LvlSelectScreen screen) {
        super(unrealDefence);
        this.lvlSelectScreen = screen;
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

        buttons = lvlSelectScreen.getButtons();
        for (int i = 0; i < buttons.size(); i++) {
            GDSprite sprite = buttons.get(i);

            if (Gdx.input.isButtonPressed(Buttons.LEFT)) {
                if (sprite.contains(screenX, screenY)) {
                    switch (i) {
                        case LvlSelectScreen.MAP1:
                            GameState.getInstance().initialize();
                            GameState.getInstance().setMap(LvlSelectScreen.MAP1);
                            unrealDefence.switchScreen(unrealDefence.getGameScreen());
                            break;
                        case LvlSelectScreen.MAIN_MENU:
                            unrealDefence.switchScreen(unrealDefence.getMainMenuScreen());
                            break;
                        case LvlSelectScreen.MAP2:
                            GameState.getInstance().setMap(LvlSelectScreen.MAP2);
                            unrealDefence.switchScreen(unrealDefence.getGameScreen());
                            break;
                        case LvlSelectScreen.MAP3:
                            GameState.getInstance().setMap(LvlSelectScreen.MAP3);
                            unrealDefence.switchScreen(unrealDefence.getGameScreen());
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
        buttons = lvlSelectScreen.getButtons();
        for (int i = 0; i < buttons.size(); i++) {
            GDSprite sprite = buttons.get(i);
            if (screenX >= sprite.getX() && screenX < sprite.getX() + sprite.getWidth()
                    && screenY >= sprite.getY() && screenY < sprite.getY() + sprite.getHeight()) {

                if (buttons.get(i).equals("menuBtn")) {
                    buttons.get(i).setAlpha(0.8f);
                } else
                    buttons.get(i).setAlpha(1);
            } else {
                if (buttons.get(i).equals("menuBtn")) {
                    buttons.get(i).setAlpha(1);
                } else
                    buttons.get(i).setAlpha(0.7f);
            }
        }
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        // TODO Auto-generated method stub
        return false;
    }
}
