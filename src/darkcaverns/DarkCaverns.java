/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns;

import darkcaverns.controllers.StartControl;
import darkcaverns.data.Game;
import darkcaverns.data.Hero;
import darkcaverns.view.MainMenuView;

/**
 *
 * @author wibur
 */
public class DarkCaverns {

    private static Game currentGame = null;
    private static Hero hero = null;
    
    
    public static void main(String[] args) {
        
        StartControl.startProgram();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        DarkCaverns.currentGame = currentGame;
    }

    public static Hero getHero() {
        return hero;
    }

    public static void setHero(Hero hero) {
        DarkCaverns.hero = hero;
    }
    
    
    
}
