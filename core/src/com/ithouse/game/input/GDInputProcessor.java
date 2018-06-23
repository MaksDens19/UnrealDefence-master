package com.ithouse.game.input;

import com.badlogic.gdx.InputProcessor;
import com.ithouse.game.UnrealDefence;

public abstract class GDInputProcessor implements InputProcessor {
    protected UnrealDefence unrealDefence;

    public GDInputProcessor(UnrealDefence unrealDefence) {
        this.unrealDefence = unrealDefence;
    }
}
