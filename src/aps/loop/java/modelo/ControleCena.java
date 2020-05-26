package aps.loop.java.modelo;

public class ControleCena
{
    public Cena cena;
    public ControleCena()
    {
        this.cena = new Cena();
    }
    public void executaEscolha(int num) throws Exception
    {
        this.executaEscolha(this.cena.getEscolhas().get(num));
    }
    public void executaEscolha(Escolha e) throws Exception
    {
        this.cena.limpar();
        String novaCena = this.cena.lerCena(e.getArquivo());
        this.cena.montaCena(novaCena);
    }
}