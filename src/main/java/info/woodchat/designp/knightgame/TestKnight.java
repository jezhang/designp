package info.woodchat.knightgame;


/**
 * Write a description of class TestKnight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestKnight
{
    public static void main(String[] args) {
        Knight jezhang = new Knight("jezhang");
        Weapon b = new KnifeWeapon();
        jezhang.hello();
        jezhang.fight();
        jezhang.useWeapon(b);
        jezhang.fight();
    }
}
