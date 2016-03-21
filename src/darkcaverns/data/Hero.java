/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns.data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author wibur
 */
public class Hero extends Actor implements  Serializable {
    
    
    private String heroName;
    private String heroClassType;
    private int levelOfHero;
    private int experience;
    private int mana;
    private int strength;
 
    private ArrayList<Item> inventory = new ArrayList<>();
    private Game game;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroClassType() {
        return heroClassType;
    }

    public void setHeroClassType(String heroClassType) {
        this.heroClassType = heroClassType;
    }

    public int getLevelOfHero() {
        return levelOfHero;
    }

    public void setLevelOfHero(int levelOfHero) {
        this.levelOfHero = levelOfHero;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Hero{" + "heroName=" + heroName + ", heroClassType=" + heroClassType + ", levelOfHero=" + levelOfHero + ", experience=" + experience + ", mana=" + mana + ", strength=" + strength + '}';
    }
    
    
}
