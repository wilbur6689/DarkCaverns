/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns.data;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author wibur
 */
public class Inventory implements Serializable {
    
    private String weaponSlot;
    private String armorSlot;
    private int healthPotionSlot;
    private int manaPotionSlot;
    
    private Hero hero;

    public Inventory(){
        
    }

    public String getWeaponSlot() {
        return weaponSlot;
    }

    public void setWeaponSlot(String weaponSlot) {
        this.weaponSlot = weaponSlot;
    }

    public String getArmorSlot() {
        return armorSlot;
    }

    public void setArmorSlot(String armorSlot) {
        this.armorSlot = armorSlot;
    }

    public int getHealthPotionSlot() {
        return healthPotionSlot;
    }

    public void setHealthPotionSlot(int healthPotionSlot) {
        this.healthPotionSlot = healthPotionSlot;
    }

    public int getManaPotionSlot() {
        return manaPotionSlot;
    }

    public void setManaPotionSlot(int manaPotionSlot) {
        this.manaPotionSlot = manaPotionSlot;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.weaponSlot);
        hash = 67 * hash + Objects.hashCode(this.armorSlot);
        hash = 67 * hash + this.healthPotionSlot;
        hash = 67 * hash + this.manaPotionSlot;
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
        final Inventory other = (Inventory) obj;
        if (this.healthPotionSlot != other.healthPotionSlot) {
            return false;
        }
        if (this.manaPotionSlot != other.manaPotionSlot) {
            return false;
        }
        if (!Objects.equals(this.weaponSlot, other.weaponSlot)) {
            return false;
        }
        if (!Objects.equals(this.armorSlot, other.armorSlot)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "weaponSlot=" + weaponSlot + ", armorSlot=" + armorSlot + ", healthPotionSlot=" + healthPotionSlot + ", manaPotionSlot=" + manaPotionSlot + ", hero=" + hero + '}';
    }
    
    
}
