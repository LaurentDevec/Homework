package ru.laurent.homework.serializable;

import ru.laurent.homework.serializable.base.BattleUnit;
import ru.laurent.homework.serializable.units.Infantry;
import ru.laurent.homework.serializable.units.King;
import ru.laurent.homework.serializable.units.Knight;

import java.util.Scanner;

public class Application {


    public void finalArgs(final int a, final Infantry infantry){
        System.out.println(a);
        int b = a * a;


        System.out.println(infantry);
        System.out.println(infantry.getHealthScore());
        infantry.plusHealth(100);
    }

    public static void main(String[] args) {

        King king01 = new King(2000);
        king01.rest();

        King king02 = new King(2000);
        king02.rest(king01);

        System.out.println(king01.getHealthScore());

        Infantry infantry01 = new Infantry(30, 10, 5);
        infantry01.upAdditionalAttack();
        infantry01.rest();
        System.out.println(infantry01.getAttackScore());
        System.out.println(infantry01.getHealthScore());

        Knight knight01 = new Knight(30, 10, 5);
        infantry01.attack(knight01);

        BattleUnit battleUnit01 = new Infantry(30, 10, 5);
        BattleUnit battleUnit02 = new Knight(30, 10, 5);


        BattleUnit[] battleUnits = {infantry01, battleUnit01, battleUnit02};
        for (BattleUnit battleUnit : battleUnits) {
            battleUnit.rest();
            battleUnit.attack(knight01);
        }

    }
}
