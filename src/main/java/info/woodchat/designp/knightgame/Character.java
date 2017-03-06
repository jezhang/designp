package info.woodchat.knightgame;


/**
 * Abstract class Character - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Character
{
    private String name;
    protected Weapon weapon;
    public Character(){}
    
    public Character(String name) {
        this.name = name;
    }
    
    public void useWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public void fight() {
        weapon.useWeapon();
    }
    
    public void hello() {
        System.out.println("Hello, My name is " + name);
    }   
    
}
