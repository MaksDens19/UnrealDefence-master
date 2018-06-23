package com.ithouse.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.ithouse.game.screen.GDScreen;
import com.ithouse.game.screen.GameOverScreen;
import com.ithouse.game.screen.GameScreen;
import com.ithouse.game.screen.LvlSelectScreen;
import com.ithouse.game.screen.MainMenuScreen;
import com.ithouse.game.screen.PauseScreen;

public class UnrealDefence extends Game {
    private MainMenuScreen mainMenuScreen;
    private GameOverScreen gameOverScreen;
    private GameScreen gameScreen;
    private PauseScreen pauseScreen;
    private LvlSelectScreen lvlSelectScreen;

    @Override
    public void create() {
        mainMenuScreen = new MainMenuScreen(this);
        gameOverScreen = new GameOverScreen(this);
        gameScreen = new GameScreen(this);
        setLvlSelectScreen(new LvlSelectScreen(this));
        setPauseScreen(new PauseScreen(this));

        switchScreen(mainMenuScreen);
    }

    public void switchScreen(GDScreen screen) {
        setScreen(screen);
        Gdx.input.setInputProcessor(screen.getInputProcessor());
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    public MainMenuScreen getMainMenuScreen() {
        return mainMenuScreen;
    }

    public void setMainMenuScreen(MainMenuScreen mainMenuScreen) {
        this.mainMenuScreen = mainMenuScreen;
    }

    public GameScreen getGameScreen() {
        return gameScreen;
    }

    public void setGameScreen(GameScreen gameScreen) {
        this.gameScreen = gameScreen;
    }

    public GameOverScreen getGameOverScreen() {
        return gameOverScreen;
    }

    public void setGameOverScreen(GameOverScreen gameOverScreen) {
        this.gameOverScreen = gameOverScreen;
    }

    public PauseScreen getPauseScreen() {
        return pauseScreen;
    }

    public void setPauseScreen(PauseScreen pauseScreen) {
        this.pauseScreen = pauseScreen;
    }

    public LvlSelectScreen getLvlSelectScreen() {
        return lvlSelectScreen;
    }

    public void setLvlSelectScreen(LvlSelectScreen lvlSelectScreen) {
        this.lvlSelectScreen = lvlSelectScreen;
    }
}
