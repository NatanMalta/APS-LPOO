package aps.loop.java.modelo;

import java.io.FileReader;

public class Arquivo
{
    public String ler(String nome) throws Exception
    {
        String retorno = "";
        FileReader arquivo = new FileReader(getClass().getClassLoader().getResource( nome + ".txt").getFile());
        int i;
        while ((i = arquivo.read()) != -1)
        {
            retorno += (char) i;
        }
        return retorno;
    }
}