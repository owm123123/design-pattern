package org.example.creational.factory.abstractfactory.hero;

import org.example.creational.factory.abstractfactory.hero.common.HeroType;

public interface Hero {
    void attack();
}

class MagicianInterface implements Hero {
    @Override
    public void attack() {
        System.out.println("Magician attacks!");
    }
}

class WarriorInterface implements Hero {
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}

class HeroFactory {
    public static Hero createHero(HeroType type) {
        return switch (type) {
            case MAGICAL -> new MagicianInterface();
            case WARRIOR -> new WarriorInterface();
        };
    }
}
