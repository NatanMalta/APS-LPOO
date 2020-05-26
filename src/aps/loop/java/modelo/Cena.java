package aps.loop.java.modelo;

import java.util.*;

public class Cena
{
    private String historia;
    private List<Escolha> escolhas;
    private String inicial = "0";
    public Cena()
    {
        this.limpar();
    }

    public void limpar()
    {
        this.escolhas.clear();
        this.setHistoria("");
    }

    public String getInicial()
    {
        return this.inicial;
    }

    public List<Escolha> getEscolhas()
    {
        return this.escolhas;
    }

    public String getHistoria()
    {
        return this.historia;
    }

    public void setInicial(String inicial)
    {
        this.inicial = inicial;
    }

    public void setHistoria(String historia)
    {
        this.historia = historia;
    }

    public String lerCena(String nome) throws Exception
    {
        Arquivo arquivo = new Arquivo();
        return arquivo.ler(nome);
    }
    public boolean montaCena(String cena)
    {
        if (cena.equals("")) return false;
        //Recebe a cena crua e a monta.
        String[] tratamento1 = cena.split("\r\n", 2);
        if(tratamento1.length != 2) return false;//Erro
        this.setHistoria(tratamento1[0]);
        String[] tratamento2 = tratamento1[1].split("\n", 0);
        for(int x = 0; x < tratamento2.length; x++)
        {
            String[] tratamentoEscolha = tratamento2[2].split(" ", 2);
            if(tratamentoEscolha.length != 2) return false;//Erro, formato da cena inválido.
            this.escolhas.add(new Escolha(tratamentoEscolha[1], tratamentoEscolha[0]));
        }
        return true;//Nada de errado
    }
}