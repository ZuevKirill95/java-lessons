package com.js.io1.game;

import com.js.io1.game.armor.Armor;
import com.js.io1.game.armor.ClothArmor;
import com.js.io1.game.weapon.Axe;
import com.js.io1.game.weapon.Weapon;

import java.io.Serializable;
import java.math.BigDecimal;

public class Hero {
    String name;
    int lvl;
    Weapon weapon;
    Armor armor;

    public Hero(String name) {
        this.name = name;
        this.lvl = 1;
        this.weapon = new Axe();
        this.armor = new ClothArmor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Герой {" +
                "Имя='" + name + '\'' +
                ", Уровень=" + lvl +
                ", Оружие=" + weapon +
                ", Броня=" + armor +
                '}';
    }
}
