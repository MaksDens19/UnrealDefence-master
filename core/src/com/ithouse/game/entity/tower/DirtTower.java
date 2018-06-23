package com.ithouse.game.entity.tower;

import com.ithouse.game.entity.Tower;
import com.ithouse.game.td.GDSprite;

public class DirtTower extends Tower {
    private int maxLevel = 5;
    private static int damageLevels[] = {1};
    private static int rangeLevels[] = {80};
    private static float attackRateLevels[] = {20f};

    public DirtTower(GDSprite sprite, int level, int cost) {
        super(sprite, damageLevels[level], rangeLevels[level], attackRateLevels[level], cost, level, "Dirt Tower");

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
