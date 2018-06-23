package com.ithouse.game.entity.projectile;

import com.badlogic.gdx.math.Vector2;
import com.ithouse.game.entity.Enemy;
import com.ithouse.game.entity.Projectile;
import com.ithouse.game.td.GDSprite;

public class ArrowProjectile extends Projectile {

    public ArrowProjectile(GDSprite sprite, Vector2 position, int damage,
                           float speed, Enemy target) {
        super(sprite, position, damage, speed, target);
        this.angle = getAngle();
        // TODO Auto-generated constructor stub
    }

    protected float getAngle() {
        return super.getAngle() + 45;
    }
}
