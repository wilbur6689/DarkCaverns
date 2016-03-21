/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darkcaverns.view;

import darkcaverns.DarkCaverns;

/**
 *
 * @author wibur
 */
public class GameMenuView extends View {
    
    public GameMenuView() {
           super( "\n"
               + "\n|----------------------------------------|"
               + "\n|                                   ___  |"
               + "\n|                _                 /   \\ |"
               + "\n|             __|_|______         /     \\|"
               + "\n|   __       |      _ _  |    ___|       |"
               + "\n|  /  `_     |  _  |_|_| |   |   |       |"
               + "\n| |  _  |    | | | |_|_| |   |___|    _  |"
               + "\n|_|_|_|_|____|_|_|_______|___|_|_|___|_|_|"
               + "\n|                                        |"
               + "\n|    This here be the Town of Kabru      |"
               + "\n|                                        |"
               + "\n|----------------------------------------|"
               + "\n"
               + "\n" + DarkCaverns.getCurrentGame().getHero().toString() 
               + "\n"
               + "\n  A - go on an [A]dventure"
               + "\n  T - visit the [T]avern"
               + "\n  B - visit the [B]lacksmith"
               + "\n  V - [V]iew Inventory"
               + "\n  H - please [H]elp!"
               + "\n  Q - [Q]uit"
               + "\n--------------------------------------");
    }
}
