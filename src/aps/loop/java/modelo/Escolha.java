package aps.loop.java.modelo;

public class Escolha
{
    private String nome;
    private String arquivo;

    public Escolha(String nome, String arquivo)
    {
        this.nome = nome;
        this.arquivo = arquivo;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getArquivo()
    {
        return this.arquivo;
    }
}