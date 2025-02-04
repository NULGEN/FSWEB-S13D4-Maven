package org.example;

public class Player {
   private String name;
   private int healthPercentage;
   private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage <0 ? 0 : (healthPercentage>100? 100:healthPercentage);
        this.weapon = weapon;
    }
    public int healthRemaining(){
        return  this.healthPercentage;
    }
    public void loseHealth(int damage){
        healthPercentage -=damage;
        if(healthPercentage<=0)
        {
            healthPercentage=0;
            System.out.println(this.name +" player has been knocked out of game ");
        }
    }
    public void restoreHealth(int healthPotion){
        healthPercentage += healthPotion;
        if(this.healthPercentage >= 100) this.healthPercentage=100;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
