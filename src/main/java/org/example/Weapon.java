package org.example;

public enum Weapon {
    SWORD(20,4),
    GUN(50,8),
    KNIFE(10,2);

    private int damage;
    private  double attackSpeed;

Weapon(int damage, double attackSpeed){
    this.damage= damage;
    this.attackSpeed = attackSpeed;
}

public  int getDamage(){
    return  this.damage;
}
public  double getAttackSpeed(){
    return this.attackSpeed;
}

}
