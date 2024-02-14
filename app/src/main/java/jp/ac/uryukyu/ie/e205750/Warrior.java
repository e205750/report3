package jp.ac.uryukyu.ie.e205750;

public class Warrior extends LivingThing {
    public Warrior(String name,int hitPoint,int damage){
        super(name,hitPoint,damage);
    }

    public void attackWithWeaponSkill(LivingThing e){
        if(isDead() == false){
            int damage  = (int)(getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), e.getName(), damage);
            e.wounded(damage);
        }
    }
}