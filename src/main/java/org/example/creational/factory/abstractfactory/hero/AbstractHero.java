package org.example.creational.factory.abstractfactory.hero;

abstract class AbstractHero {
    private int coin = 10;
    private String hair = "black";
    public String getHair() {
        return hair;
    }
    public void setHair(String hair) {
        this.hair = hair;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    public void canJump() {
        System.out.println("I can jump!");
    }
    public abstract void attack();
}

class MagicianAbstract extends AbstractHero {
    @Override
    public void attack() {
        System.out.println("Magician attacks!");
    }
}

class WarriorAbstract extends AbstractHero {
    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }
}

class HeroFactoryAbstract {
    public static AbstractHero createHero(String type) {
        return switch (type) {
            case "Magician" -> new MagicianAbstract();
            case "Warrior" -> new WarriorAbstract();
            default -> throw new IllegalArgumentException("Unknown hero type: " + type);
        };
    }
}
