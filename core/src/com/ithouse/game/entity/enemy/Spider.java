package com.ithouse.game.entity.enemy;

import com.ithouse.game.entity.Enemy;
import com.ithouse.game.td.GDSprite;

import java.awt.Point;
import java.util.List;

public class Spider extends Enemy {

    public Spider(GDSprite sprite, int health, int moneyReward, float speed, List<Point> waypoints) {
        super(sprite, health, moneyReward, speed, waypoints);
    }
}
