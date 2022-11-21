package ru.laurent.homework.serializable.units;

import ru.laurent.homework.serializable.base.BattleUnit;

public final class Infantry extends BattleUnit {
    private int additionalAttack;

    public Infantry(int healthScore, int attackScore,
                    int additionalAttack){
        super(healthScore, attackScore);
        if (additionalAttack < 1) {
            throw new IllegalArgumentException("additionalAttack не мб меньше 1");
        }
        this.additionalAttack = additionalAttack;
    }

    public void upAdditionalAttack(){
        additionalAttack += (int) (Math.random() * 3);
    }

    @Override
    public void attack(BattleUnit enemy){
        System.out.println("Infantry атакует");
        enemy.minusHealth(this.attackScore);
        if (Math.random() < 0.5) enemy.minusHealth(this.additionalAttack);
    }

}

