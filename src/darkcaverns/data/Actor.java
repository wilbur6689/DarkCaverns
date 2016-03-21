/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns.data;

import java.util.Objects;

/**
 *
 * @author wibur
 */
public class Actor {
    
    private String name;
    private int hitPoints;
    private int defence;
    private int attack;
    private int chanceToHit;
    private int gold;
    
    private Event[] event;
    private Game game;
    
     public Actor() {
        
    }

    public Actor(String name, int hitPoints, int defence, int attack, int chanceToHit, int gold) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.defence = defence;
        this.attack = attack;
        this.chanceToHit = chanceToHit;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getChanceToHit() {
        return chanceToHit;
    }

    public void setChanceToHit(int chanceToHit) {
        this.chanceToHit = chanceToHit;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Event[] getEvent() {
        return event;
    }

    public void setEvent(Event[] event) {
        this.event = event;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.hitPoints;
        hash = 53 * hash + this.defence;
        hash = 53 * hash + this.attack;
        hash = 53 * hash + this.chanceToHit;
        hash = 53 * hash + this.gold;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (this.hitPoints != other.hitPoints) {
            return false;
        }
        if (this.defence != other.defence) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.chanceToHit != other.chanceToHit) {
            return false;
        }
        if (this.gold != other.gold) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", hitPoints=" + hitPoints + ", defence=" + defence + ", attack=" + attack + ", chanceToHit=" + chanceToHit + ", gold=" + gold + '}';
    }
    
    
    
}
