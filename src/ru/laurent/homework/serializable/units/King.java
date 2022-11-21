package ru.laurent.homework.serializable.units;

import ru.laurent.homework.serializable.base.AppSettings;
import ru.laurent.homework.serializable.base.BattleUnit;
import ru.laurent.homework.serializable.base.Unit;

public class King extends Unit {
    private int gold = AppSettings.GOLD;

    private BattleUnit[] army;

    public King(int healthScore){
        super(healthScore); // вызов констркуктора родителя
    }

    public int getGold(){
        return gold;
    }

    public void generateArmy(){
        if (gold < AppSettings.ARMY_PRICE) {
            System.out.println("Стоимость армии " + AppSettings.ARMY_PRICE);
            return;
        }
        gold -= AppSettings.ARMY_PRICE;
        army = BattleUnit.getBattleUnits(AppSettings.UNITS_COUNT);
    }

    public void updateArmy(){
        for (int i = 0; i < army.length; i++) {
            if (gold < AppSettings.UNIT_PRICE) {
                System.out.println("Стоимость юнита " + AppSettings.UNIT_PRICE);
                return;
            }
            if (!army[i].isAlive()) {
                gold -= AppSettings.UNIT_PRICE;
                army[i] = BattleUnit.getBattleUnit();
            }
        }
    }

    public void rest(){
        if (gold < AppSettings.REST_PRICE) return;
        gold -= AppSettings.REST_PRICE;


        super.rest();


        System.out.println("King восстанавливает силы");
    }

    public final void rest(Unit unit){
        if (gold < 20) return;
        gold -= 20;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("King и Unit восстанавливают силы");
    }
}