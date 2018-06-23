package com.ithouse.game.screen;

import com.badlogic.gdx.Screen;
import com.ithouse.game.input.GDInputProcessor;

public abstract class GDScreen implements Screen {
    protected GDInputProcessor inputProcessor;
    public static final float BACKGROUND_WIDTH = 1300;
    public static final float BACKGROUND_HEIGHT = 1300;

    public static final float BUTTONS_WIDTH = 400;
    public static final float BUTTONS_HEIGHT = 100;


    public GDInputProcessor getInputProcessor() {
        return inputProcessor;
    }
}
