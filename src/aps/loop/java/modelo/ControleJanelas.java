package aps.loop.java.modelo;

import aps.loop.java.apresentacao.frmGame;

public class ControleJanelas
{
    frmGame frmG;
    public ControleJanelas()
    {
        frmGame frmG = new frmGame(null, true);
        frmG.setVisible(true);
    }
}