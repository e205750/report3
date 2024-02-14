package jp.ac.uryukyu.ie.e205750;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


public class WarriorTest {
    @Test
    void attackWithWeaponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ剣士", 100 ,100);
        Enemy demoEnemy1 = new Enemy("スライムもどき1", 150, 0);
        Enemy demoEnemy2 = new Enemy("スライムもどき2", 150, 0);
        Enemy demoEnemy3 = new Enemy("スライムもどき3", 150,0);   
        
        ArrayList<Enemy> enemyList = new ArrayList<>();
        enemyList.add(demoEnemy1);
        enemyList.add(demoEnemy2);
        enemyList.add(demoEnemy3);

        for(Enemy e:enemyList){
            demoWarrior.attackWithWeaponSkill(e);
            int nowSlimeHitpoint = e.getHitPoint();
            assertEquals(0, nowSlimeHitpoint);
        }   
    }
}