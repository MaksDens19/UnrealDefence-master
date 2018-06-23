package com.ithouse.game.entity.tower;

import com.ithouse.game.entity.GameState;
import com.ithouse.game.entity.Tower;
import com.ithouse.game.td.GDSprite;

public class CurrencyTower extends Tower {
    private int maxLevel = 3;
    private static int damageLevels[] = {15};
    private static int rangeLevels[] = {0};
    private static float attackRateLevels[] = {.04f};

    public CurrencyTower(GDSprite sprite, int level, int cost) {
        super(sprite, damageLevels[level], rangeLevels[level], attackRateLevels[level], cost, level, "Currency Tower");

    }

    public void update(float delta) {
        sprite.setX(this.position.x);
        sprite.setY(this.position.y);
        shoot(delta);
    }

    private void shoot(float delta) {
        attackTimer += delta;
        if (attackTimer >= attackCooldown) {
            attackTimer = 0;
            GameState.getInstance().addMoney(this.damage);
        }
    }

    public void upgrade() {
        if (level + 1 <= maxLevel)
            level++;

        damage = damageLevels[level];
        attackRange = rangeLevels[level];
        attackRate = attackRateLevels[level];
        setAttackCooldown(attackRate);
    }
}
