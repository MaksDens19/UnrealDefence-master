package com.ithouse.game.entity.projectile;

import com.badlogic.gdx.math.Vector2;
import com.ithouse.game.entity.Enemy;
import com.ithouse.game.entity.Projectile;
import com.ithouse.game.td.GDSprite;

public class EggProjectile extends Projectile {

    public EggProjectile(GDSprite sprite, Vector2 position, int damage,
                         float speed, Enemy target) {
        super(sprite, position, damage, speed, target);
        slowDuration = 1;
    }
}
