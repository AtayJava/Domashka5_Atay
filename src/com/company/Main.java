package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();
	boss.setHealth(500);
	boss.setDamage(100);
	boss.setProtection("Magical");

        System.out.println("Boss health : " + boss.getHealth() + ";" + " " +
                "Boss damage : " + boss.getDamage() + ";" + " " +
				"Type of Protection : " + boss.getProtection());
    }
}
