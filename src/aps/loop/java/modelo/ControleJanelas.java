package aps.loop.java.modelo;

import aps.loop.java.apresentacao.frmGame;
import aps.loop.java.apresentacao.frmGameCena;

public class ControleJanelas
{
    
    public ControleJanelas(String janela)
    {
        
        
        switch(janela)
        {
            case "Game":
                frmGame frmG = new frmGame(null, true);
                frmG.setVisible(true);
                 break;
                 
            case "Cena":
                frmGameCena frmGC = new frmGameCena(null, true);
                frmGC.setVisible(true);
                break;
        }
        
        
    }
}